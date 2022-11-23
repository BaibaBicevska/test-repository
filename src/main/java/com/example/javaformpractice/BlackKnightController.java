package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class BlackKnightController {

    @FXML
    private Text knightNameInfo;

    @FXML
    private Text knightProps;

    @FXML

     public static BlackKnight activeBlackKnight;

    @FXML
    void endGame(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide(); //closes the window
    }

    @FXML
    void startGame(ActionEvent event) {
        knightNameInfo.setText("Currently playing with knight " + activeBlackKnight.getName());
        knightProps.setText(activeBlackKnight.toString());
    }

        @FXML
    private TextField knightName;
    @FXML
    void strikeKnight() {
        if(activeBlackKnight.isAlive()){
            activeBlackKnight.strike();
            knightProps.setText(activeBlackKnight.toString());
        }else{Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Your BlackNight is DEAD!!!" + activeBlackKnight.getName());
            alert.show();}
        activeBlackKnight.strike();

        knightNameInfo.setText("Currently playing with knight " + activeBlackKnight.getName());
        knightProps.setText(activeBlackKnight.toString());
    }

    @FXML
    void createKnight(ActionEvent event) throws IOException{
            if(knightName.getText().equals("")) {
                BlackKnight.createKnight();
            }else{
                BlackKnight.createKnight(knightName.getText());
            }

        BlackKnight.createKnight(knightName.getText());
        activeBlackKnight = BlackKnight.getLatestKnight();
        ((Node)event.getSource()).getScene().getWindow().hide(); //closes the window
        activeBlackKnight = new BlackKnight(knightName.getText());
        showGameWindow();

    }


          private void showGameWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("black-knight-player.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage primaryStage = new Stage();
       primaryStage.setTitle("Welcome to the game!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
/*  Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your BlackNight is DEAD!!!");
        alert.show();*/