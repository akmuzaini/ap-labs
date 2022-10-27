/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

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
public class Lab07 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(20);
        root.setHgap(40);
        root.setPadding(new Insets(10));
        root.setBackground(new Background(new BackgroundFill(Color.YELLOW, 
                CornerRadii.EMPTY, 
                Insets.EMPTY)));
        
        Label title = new Label("Add a new student");
        title.setFont(Font.font("", FontWeight.BOLD, 20.0));
        
        title.setTextFill(Color.RED);
        root.setConstraints(title, 0, 0, 2, 1, HPos.CENTER, VPos.BASELINE);
        root.add(title, 0, 0, 2, 1);
        
        Font labelFont = Font.font("", FontWeight.BOLD, 16.0);
        
        Label nameLabel = new Label("Name:");
        nameLabel.setTextFill(Color.BLUE);
        nameLabel.setFont(labelFont);
        root.add(nameLabel,0,1);
        
        TextField textField = new TextField();
        textField.setFont(labelFont);
        nameLabel.setLabelFor(textField);
        root.add(textField,1,1);
        
        Label passLabel = new Label("Password:");
        passLabel.setTextFill(Color.BLUE);
        passLabel.setFont(labelFont);
        root.add(passLabel,0,2);
        
        PasswordField passField = new PasswordField();
        passField.setFont(labelFont);
        passLabel.setLabelFor(passField);
        root.add(passField,1,2);
        
        Label genderLabel = new Label("Gender:");
        genderLabel.setTextFill(Color.BLUE);
        genderLabel.setFont(labelFont);
        root.add(genderLabel,0,3);
        
        ToggleGroup genderGroup = new ToggleGroup();
        
        RadioButton radioMale = new RadioButton("Male");
        radioMale.setFont(labelFont);
        radioMale.setToggleGroup(genderGroup);
        
        RadioButton radioFemale = new RadioButton("Female");
        radioFemale.setFont(labelFont);
        radioFemale.setToggleGroup(genderGroup);
        
        HBox radioHbox = new HBox(10);
        radioHbox.getChildren().add(radioMale);
        radioHbox.getChildren().add(radioFemale);
        root.add(radioHbox, 1, 3);
        
        Label langLabel = new Label("Known Languages:");
        langLabel.setTextFill(Color.BLUE);
        langLabel.setFont(labelFont);
        root.add(langLabel,0,4);
        
        CheckBox arCheck = new CheckBox("Arabic");
        arCheck.setFont(labelFont);
        
        CheckBox enCheck = new CheckBox("English");
        enCheck.setFont(labelFont);
        
        CheckBox frCheck = new CheckBox("French");
        frCheck.setFont(labelFont);
        
        HBox checkHbox = new HBox(10);
        checkHbox.getChildren().add(arCheck);
        checkHbox.getChildren().add(enCheck);
        checkHbox.getChildren().add(frCheck);
        root.add(checkHbox, 1, 4);
        
        Label listLabel = new Label("Available Courses:");
        listLabel.setTextFill(Color.BLUE);
        listLabel.setFont(labelFont);
        root.add(listLabel,0,5);
        
        ListView listView = new ListView();
        listView.getItems().addAll("Advanced Programming",
                                    "Internet Applications",
                                    "Computer Networks",
                                    "Digital Logic Design");
        
        root.add(listView,1,5);
        
        root.setGridLinesVisible(true);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Adding new student");
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
