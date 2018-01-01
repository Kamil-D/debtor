package com.debtor.dzialek;

import com.debtor.dzialek.view.util.FxmlUtil;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static com.debtor.dzialek.model.enums.ViewFxmlPath.MAIN_VIEW;
import static com.debtor.dzialek.util.MessageProvider.initializeMessageSource;
import static com.debtor.dzialek.util.MessageProvider.initializeResourceBundleForFxml;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Main extends Application {

//    public static void main(String[] args) {
//        launchApp(Main.class, DebtorMainView.class, args);
//    }

    private ConfigurableApplicationContext springContext;
    private Parent rootNode;

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(Main.class);
        initializeMessageSource();
        initializeResourceBundleForFxml();
        FxmlUtil.init(springContext);
//        FxmlUtil.loadFxml(DEBTOR_MAIN_FXML);
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(DEBTOR_MAIN_FXML));
//        fxmlLoader.setControllerFactory(springContext::getBean);
        rootNode = FxmlUtil.loadFxml(MAIN_VIEW.getFxmlPath());
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FxmlUtil.openMainStageForGivenScene(primaryStage, rootNode);
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("javafxviews/login.fxml"));
//        primaryStage.setTitle("Kredytobiorcy");
//        primaryStage.setScene(new Scene(root, 450, 250));
//        primaryStage.setResizable(false);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
//    }

    public static void main(String[] args) {
        launch(args);
    }
}