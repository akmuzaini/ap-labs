/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author s441004887
 */
public class Lab06 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new HBox(15);
        
        root.setBackground(new Background(new BackgroundFill(Color.YELLOW, 
                CornerRadii.EMPTY, 
                Insets.EMPTY)));
        
        root.setPadding(new Insets(10));
        
        root.setBorder(new Border(new BorderStroke(Color.BLUE,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                new BorderWidths(10))));
        
        Button[] btn = new Button[10];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Button " + (i + 1));

            root.getChildren().add(btn[i]);
        }

        Scene scene = new Scene(root);
        primaryStage.setTitle("Lab06");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }

}
