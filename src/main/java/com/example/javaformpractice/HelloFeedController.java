package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloFeedController {

    @FXML
    void travel(ActionEvent event) {
    }




    @FXML
    private Button Alien;

    @FXML
    private Button Apple;

    @FXML
    private Button Banana;
    @FXML
    private ToggleGroup travel;

    @FXML
    private Button Book;

    @FXML
    private Button Car;

    @FXML
    private Button Human;

    @FXML
    private Button Juice;

    @FXML
    private Button Lamp;

    @FXML
    private Button Metal;

    @FXML
    private Button Phone;

    @FXML
    private Button Shoe;

    @FXML
    private Button Sweets;

    @FXML
    private Button pan;

    @FXML
    private Text TextA;

    @FXML
    private Text TextB;

    @FXML
    private Text TextD;

    @FXML
    private Text TextC;
    @FXML
    private Text TextC1;

    @FXML
    private Text TextC11;

    @FXML
    void Reaction(ActionEvent event) {
        if(TextC.getText().isEmpty()){
           TextC.setText("Perfect! :)");
            } else if (TextA.getText().isEmpty()){
            TextA.setText("Fantastic! :)");
        } else if (TextB.getText().isEmpty()){
            TextB.setText("Cool! :)");

        } else if (TextD.getText().isEmpty()){
            TextD.setText("Sooo, Great! :)");
        } else if (TextC1.getText().isEmpty()){
            TextC1.setText("YOU ARE THE BEST! :)");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("I am done!!!");
            alert.show();
        }
    }

    @FXML
    void Alien(ActionEvent event) throws IOException {
        startToEat();
        ((Node) event.getSource()).getScene().getWindow().hide(); //closes the window
    }



    @FXML
    void Human(ActionEvent event) throws IOException {
        EatHuman();
        ((Node) event.getSource()).getScene().getWindow().hide(); //closes the window
    }

    @FXML
    void Apple(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();

    }

    @FXML
    void Banana(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Juice(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Sweets(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Book(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Car(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Lamp(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Metal(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Phone(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();

    }

    @FXML
    void pan(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    void Shoe(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("That's no food for you?");
        alert.show();
    }

    @FXML
    private Button Cake;


    @FXML
    private Button Coffee;

    @FXML
    private Button Orange;

    @FXML
    private Button Pancake;
    @FXML
    private  Text Text1;

    @FXML
    private Text Text2;

    @FXML
    private Text Text3;
    @FXML
    private Text Text4;

    @FXML
    void Button(ActionEvent event) {
        if(Text1.getText().isEmpty()){
        if (event.getSource() == Cake) {
            Text1.setText("Perfect! :)");
        } }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("I am done!!!");
            alert.show();
        }}
    @FXML
    void Orange(ActionEvent event) {
        if(Text2.getText().isEmpty()){
        if (event.getSource() == Orange) {
            Text2.setText("Delicious");
        } }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("I am done!!!");
            alert.show();
        }}

    @FXML
    void Pancake(ActionEvent event) {
        if(Text3.getText().isEmpty()){
        if (event.getSource() == Pancake) {
            Text3.setText("Beautiful");
        } }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("I am done!!!");
            alert.show();
        }}
 
        @FXML
        void Coffee(ActionEvent event) {
        if(Text4.getText().isEmpty()){
            if (event.getSource() == Coffee) {

                Text4.setText("Fantactic!!!");
            } }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("I am done!!!");
                alert.show();
            }
                }
//        nameText1.setText(inputName.getText());
//        ageText.setText(inputAge.getText());
//        genderText.setText(inputGender.getText());
//        if (!inputName.getText().isEmpty() && !inputAge.getText().isEmpty() && !inputGender.getText().isEmpty()) {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("Thank you!!!");
//        alert.show();
//    } else {
//        if (inputName.getText().isEmpty()) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("No Name provided!!!");
//            alert.show();
//        }


//||Text2.getText().isEmpty()||Text3.getText().isEmpty())||Text4.getText().isEmpty()
// Orange, Coffee, Pancake


        private void startToEat () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Food.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage eatStage = new Stage();
            eatStage.setTitle("Welcome to the game!");
            eatStage.setScene(scene);
            eatStage.show();
        }

        private void EatHuman () throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EatHuman.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage eatHuman = new Stage();
            eatHuman.setTitle("Welcome to the game!");
            eatHuman.setScene(scene);
            eatHuman.show();
        }
    }

//    Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setContentText("Do you want to eat?");
//                    alert.show();