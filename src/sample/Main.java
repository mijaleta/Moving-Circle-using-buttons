package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
try{

    

    //adding image to title of stage
    Image img = new Image("friends.jpg");
    stage.getIcons().add(img);

    Parent root = FXMLLoader.load(getClass().getResource("MovingCircle.fxml"));
    stage.setTitle("miretu jaleta chala ");
    stage.setScene(new Scene(root));
    stage.show();
}
catch (Exception e){
    e.printStackTrace();
}

    }


    public static void main(String[] args) {
        launch(args);
    }
}
