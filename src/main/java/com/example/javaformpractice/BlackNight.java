package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.text.Text;

public class BlackNight {
    @FXML
    private Button arm1;

    @FXML
    private Button arm11;

    @FXML
    private Button arm2;

    @FXML
    private Button arm21;

    @FXML
    private Button head;

    @FXML
    private Button head1;

    @FXML
    private TextField inputAmount;

    @FXML
    private TextField inputAmount1;

    @FXML
    private Button leg1;

    @FXML
    private Button leg11;

    @FXML
    private Button leg2;

    @FXML
    private Button leg21;

    @FXML
    private Button start1;

    @FXML
    private Button start11;

    @FXML
    private Text text;

    @FXML
    private Text text1;

    @FXML
    void DEAD(InputMethodEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your BlackNight is DEAD!!!");
        alert.show();
    }

    @FXML
    void arm1(ActionEvent event) {

    }

    @FXML
    void arm2(ActionEvent event) {

    }

    @FXML
    void head(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your BlackNight is DEAD!!!");
        alert.show();
    }

    @FXML
    void leg1(ActionEvent event) {

    }

    @FXML
    void leg2(ActionEvent event) {

    }

    @FXML
    void startTheGame(ActionEvent event) {

    }

    @FXML
    void startTheGame1(ActionEvent event) {

    }

}
/*  Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your BlackNight is DEAD!!!");
        alert.show();*/