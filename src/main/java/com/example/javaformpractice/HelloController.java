package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.jar.Attributes;

public class HelloController {


    @FXML
    private Text ageText;

    @FXML
    private Text genderText;

    @FXML
    private TextField inputAge;

    @FXML
    private TextField inputGender;

    @FXML
    private TextField inputName;

    @FXML
    private Text nameText1;

    @FXML
    private Button submitButton;



    @FXML
    void onButtonClick(ActionEvent event) {
        nameText1.setText(inputName.getText());
        ageText.setText(inputAge.getText());
        genderText.setText(inputGender.getText());
        if (!inputName.getText().isEmpty() && !inputAge.getText().isEmpty() && !inputGender.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Thank you!!!");
            alert.show();
        } else {
            if (inputName.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("No Name provided!!!");
                alert.show();
            }

            if (inputAge.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("No Age provided!!!");
                alert.show();
            }

            if (inputGender.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("No Gender provided!!!");
                alert.show();
            }

        }
    }

    }



