package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    public TextField text;

    public WebEngine engine = new WebEngine();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine.setPromptHandler(data -> {
            System.out.println(data.getMessage());
            return "";
        });
    }

    public void buttonAction(ActionEvent actionEvent) {
//        engine.executeScript("Java.type('sample.JSCall').callback('static method');");
        engine.executeScript("prompt('" + text.getText() + "');");
    }
}
