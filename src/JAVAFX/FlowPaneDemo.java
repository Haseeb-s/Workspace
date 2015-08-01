import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;


public class FlowPaneDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws InterruptedException, IOException {

        primaryStage.setTitle("ShowFlowPane1");
        Scene scene1 = new Scene(new Group());


        Button btn1 = new Button("Butt1");
        Button btn2 = new Button("Butt2");
        Button btn3 = new Button("Butt3");
        btn1.setPrefSize(200, 25);
        btn2.setPrefSize(200, 25);
        btn3.setPrefSize(200, 25);

        FlowPane flow = new FlowPane();
        flow.setVgap(30);
        flow.setHgap(1);
        flow.setPrefWrapLength(300);
        flow.getChildren().add(btn1);
        flow.getChildren().add(btn2);
        flow.getChildren().add(btn3);

        scene1.setRoot(flow);
        primaryStage.setScene(scene1);
        primaryStage.show();

        final Stage newStage = new Stage();
        Group newRoot = new Group();
        Scene scene = new Scene(newRoot, 300, 200);
        newStage.setScene(scene);
        newStage.show();

        FlowPane flowbox = new FlowPane();

        Button btn11 = new Button("Butt1");
        Button btn12 = new Button("Butt2");
        Button btn13 = new Button("Butt3");
        btn1.setPrefSize(200, 25);
        btn2.setPrefSize(200, 25);
        btn3.setPrefSize(200, 25);

        Label newLabel = new Label();
        newLabel.setText(newStage.toString());
        newStage.setTitle("SECOND SCREEN");
        Button btnClose = new Button("Close");
        btnClose.setOnAction(t -> newStage.close());

        flowbox.getChildren().addAll(btn11, btn12, btn13);
        newRoot.getChildren().add(flowbox);
    }


}

