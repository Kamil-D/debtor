package com.debtor.dzialek.view.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

import static com.debtor.dzialek.model.enums.ViewFxmlPath.ADD_DEBTOR;

public class FxmlUtil {

    private static final Logger log = LoggerFactory.getLogger(FxmlUtil.class);

    private static ConfigurableApplicationContext springContext;

    public static void init(ConfigurableApplicationContext springContext) {
        FxmlUtil.springContext = springContext;
    }

    public static Pane loadFxml(String fxmlPath){
        FXMLLoader fxmlLoader = new FXMLLoader(FxmlUtil.class.getResource(fxmlPath));
        fxmlLoader.setControllerFactory(springContext::getBean);
        try {
            log.info("fxml resource from %s properly loaded", fxmlPath);
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.warn("loading fxml resource from %s failed!", fxmlPath);
        return null;
    }

    public static void openAddNewDebtorWindow() {
        Parent rootNode = FxmlUtil.loadFxml(ADD_DEBTOR.getFxmlPath());
        Stage stage = new Stage();
        stage.setTitle("Nowy Kredytobiorca");
        stage.setScene(new Scene(rootNode, 800, 550));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void openMainStageForGivenScene(Stage primaryStage, Parent rootNode){
        primaryStage.setTitle("Kredytobiorcy");
        primaryStage.setScene(new Scene(rootNode, 1200, 800));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

}
