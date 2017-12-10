package com.debtor.dzialek;

import javafx.application.Application;
import com.debtor.dzialek.view.DebtorMainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/javafxviews/debtormain.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Kredytobiorcy");
        primaryStage.setScene(new Scene(rootNode, 1200, 800));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
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