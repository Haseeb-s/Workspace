import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Haseeb on 7/29/2015.
 */
public class CardRefreshButton extends Application {
    public ArrayList<ImageView> pokerCards = new ArrayList<ImageView>();
    public ImageView TEST = new ImageView();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Shuffling Cards");
        Group root = new Group();
        HBox hBox = new HBox(4);
        BorderPane pane = new BorderPane();
        pane.setPrefSize(300,125);
        setCards();


        Collections.shuffle(pokerCards);

        for (int j = 0; j < 4; j++) {
            hBox.getChildren().add(pokerCards.get(j));
        }

        Button refresh = new Button("Refresh");
        refresh.setPrefSize(75,25);
        refresh.setOnAction(e -> {
            hBox.getChildren().clear();
            Collections.shuffle(pokerCards);

            for (int j = 0; j < 4; j++) {
                hBox.getChildren().add(pokerCards.get(j));
            }
        });
        hBox.getChildren().add(refresh);
        pane.getChildren().add(hBox);
        pane.setBottom(refresh);
        BorderPane.setAlignment(refresh, Pos.CENTER);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void setCards() {
        int x = 1;
        for (int j = 0; j < 54; j++) {
            //ABOSULTE FILE
            File fileName = new File("C:/Users/Haseeb/Desktop/Pokercards/" + x + ".png");
            Image img = new Image(fileName.toURI().toString());
            ImageView imgView = new ImageView(img);
            pokerCards.add(imgView);
            x++;
        }
    }
}


