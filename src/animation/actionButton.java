package animation;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class actionButton {
    private TranslateTransition push;

    public actionButton (Node node){

        push = new TranslateTransition(Duration.millis(30), node);
        push.setFromX(0f);
        push.setByX(15f);
        push.setCycleCount(6);
        push.setAutoReverse(true);
    }
    public void runAnimation () {
        push.playFromStart();
    }

}
