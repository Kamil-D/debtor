package com.debtor.dzialek;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.debtor.dzialek.view.DebtorMainView;

@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport{

    public static void main(String[] args) {
        launchApp(Main.class, DebtorMainView.class, args);
    }
}