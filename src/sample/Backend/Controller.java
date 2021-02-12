package sample.Backend;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import animation.actionButton;
import com.sun.javafx.stage.EmbeddedWindow;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

import javax.swing.*;

public class Controller {
    public int count = 0;
    FXMLLoader loader = new FXMLLoader();
    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button new_game;

    @FXML
    private Button download;

    @FXML
    private Button settings;

    @FXML
    private Button exit;

    @FXML
    void initialize() {

        System.gc();

    new_game.setOnAction(actionEvent -> {

               openNewFrame("/Visual/newGame.fxml", new_game);
//        try {
//            Thread.sleep(1000);
////        actionButton button = new actionButton(new_game);
////
////        try {
////            button.runAnimation();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//            new_game.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader();
//            Stage stage = new Stage();
//
//
//            loader.setLocation(getClass().getResource("/Visual/newGame.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Parent root = loader.getRoot();
//            stage.setScene(new Scene(root));
//            stage.showAndWait();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    });
    download.setOnAction(actionEvent -> {

        actionButton button = new actionButton(download);

        try {
            button.runAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    });
        settings.setOnAction(actionEvent -> {});

        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });

    }


        protected void openNewFrame (String window, Node button){

                button.getScene().getWindow().hide();

                loader.setLocation(getClass().getResource(window));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                   }
                Parent root = loader.getRoot();
                stage.setScene(new Scene(root));
                count++;
                stage.show();
        }
}
