package com.debtor.dzialek.view.util;

import com.debtor.dzialek.model.enums.ViewFxmlPath;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

import static com.debtor.dzialek.model.enums.ViewFxmlPath.ADD_DEBTOR;
import static com.debtor.dzialek.util.MessageProvider.getMessage;
import static com.debtor.dzialek.util.MessageProvider.getResourceBundle;

public class FxmlUtil {

    private static final Logger log = LoggerFactory.getLogger(FxmlUtil.class);

    private static ConfigurableApplicationContext springContext;

    public static void init(ConfigurableApplicationContext springContext) {
        FxmlUtil.springContext = springContext;
    }

    public static void openMainStageForGivenScene(Stage primaryStage, Parent rootNode) {
        primaryStage.setTitle(getMessage("view.main.window.title"));
        primaryStage.setScene(new Scene(rootNode, 1200, 800));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static Pane loadFxml(ViewFxmlPath fxmlPath) {
        FXMLLoader fxmlLoader = new FXMLLoader(FxmlUtil.class.getResource(fxmlPath.getFxmlPath()));
        fxmlLoader.setControllerFactory(springContext::getBean);
        fxmlLoader.setResources(getResourceBundle());
        try {
            log.info("fxml resource from {} properly loaded", fxmlPath);
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.error("loading fxml resource from {} failed!", fxmlPath);
        return null;
    }

    public static void openAddNewDebtorStage() {
        Parent rootNode = FxmlUtil.loadFxml(ADD_DEBTOR);
        Stage stage = new Stage();
        stage.setTitle(getMessage("view.add.debtor.window.title"));
        stage.setScene(new Scene(rootNode, 800, 550));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

}
