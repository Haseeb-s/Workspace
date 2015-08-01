import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class AroundACircle extends Application{
    public static void main(String[] args){Application.launch(args);}

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Cirle Char");
        Group root = new Group();
        Scene scene = new Scene(root, 250,250);

        String str = "Welcome to Java";


        int i = 0;
        double radius = Math.min(250,250) * 0.8 * 0.5;
        double degree = 360.0 / (str.length() / .975);
        for (double degrees = 240;
             i < str.length(); i++, degrees += degree) {
            double pointX = 200 + radius *
                    Math.cos(Math.toRadians(degrees)) - (15) * 5;
            double pointY = 200 + radius *
                    Math.sin(Math.toRadians(degrees)) - (15) * 4;
            Text letter = new Text(pointX, pointY,
                    String.valueOf(str.charAt(i)));
            letter.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 36));
            letter.setRotate(degrees + 90);
            letter.setTextAlignment(TextAlignment.CENTER);
            root.getChildren().add(letter);
        }


    primaryStage.setScene(scene);
    primaryStage.show();

    }
}
