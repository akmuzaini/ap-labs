/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author s441004887
 */
public class Assignment1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        VBox head = new VBox();
        /**
         * TODO
         * add student name, ID, Group# and title
         */
        
        GridPane center = new GridPane();
        /**
         * TODO
         * add 2 rows 3 columns
         * first cell rowspan = 2
         * has a pane containing the buttons
         * second column has labels for input fields
         * third column has 2 text fields
         * 
         */
        
        VBox bottom = new VBox();
        /**
         * has the result text control
         * and an exit button under it
         */
        
        Scene scene = new Scene(root);

        primaryStage.setTitle("Mathematical Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * TODO
     * method to handle calculation event
     * Textfield tf1
     * Textfield tf2
     * String operator
     * Text result
     * 
     * method to handle output display
     * double num1
     * double num2
     * String operator
     * method to handle error display
     */

    public static void main(String[] args) {
        launch();
    }

}
