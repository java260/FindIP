
package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FindIP extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layoutFindIP.fxml"));
        
        Scene scene = new Scene(root);
        
        Image image = new Image("/image/icon.png");
        stage.getIcons().add(image);
        stage.setTitle("Find IP");
        stage.setMaxHeight(450);
        stage.setMaxWidth(518);
        stage.setMinHeight(450);
        stage.setMinWidth(518);
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
