package sample;

//import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class MovingCircleController {
    @FXML
Circle myCircle ;
double x;
double y;

public void up(ActionEvent e){
    System.out.println("you clicked up now");
    myCircle.setCenterY(y-=10);
}
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=10);

        //System.out.println("DOWN");
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=10);

        // System.out.println("LEFT");
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=10);


    }

}
