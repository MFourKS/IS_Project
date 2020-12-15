package sample.Backend;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import animation.actionButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class newGame extends Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton morkou;

    @FXML
    private RadioButton samael;

    @FXML
    private RadioButton colon;

    @FXML
    private Button begin;

    @FXML
    private ImageView home;

    @FXML
    void initialize() {

        System.gc();

        home.setOnMouseClicked(actionEvent -> {

//            actionButton button = new actionButton(home);
//
//            try {
//                button.runAnimation();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
               openNewFrame("/Visual/sample.fxml", home);
           //   home.getScene().getWindow().hide();

           //   openNewFrame("/Visual/sample.fxml", home);

        });


    }
}
