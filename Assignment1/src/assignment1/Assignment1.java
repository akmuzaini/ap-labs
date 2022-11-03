/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.*;
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
        /**
         * root pane: a border pane, where the top contains the headings
         * (student info and form title) and they are contained in a VBox
         *
         * center contains the input textfields they are in a grid pane with two
         * rows and two columns
         *
         * left contains the buttons for the various operations needed and
         * they're contained in a VBox
         *
         * bottom contains both the label for the results and the exit button
         */
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        root.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY,
                CornerRadii.EMPTY,
                Insets.EMPTY)));

        /**
         * VBox to contain the headings
         */
        VBox head = new VBox();
        root.setTop(head);
        head.setAlignment(Pos.CENTER);
        head.setPadding(new Insets(10, 0, 20, 0));
        head.setSpacing(10);
        /**
         * Student info heading
         */
        Text info = new Text();
        info.setText("Name: Abdulrahman Al-Muzaini"
                + "\nID: 441004887"
                + "\nGroup: 1");
        info.setFill(Color.BLUE);
        info.setFont(Font.font("", FontWeight.BOLD, 20.0));
        head.getChildren().add(info);

        /**
         * title heading
         */
        Text title = new Text();
        title.setText("Calculate a mathematical operation");
        title.setFill(Color.BLUE);
        title.setFont(Font.font("", FontWeight.BOLD, 18.0));
        head.getChildren().add(title);

        /**
         * GridPane to contain the input textfields
         */
        GridPane center = new GridPane();
        root.setCenter(center);
//        center.setGridLinesVisible(true);
        center.setPadding(new Insets(10, 0, 20, 0));
        center.setHgap(10);
        center.setVgap(10);
        center.setAlignment(Pos.CENTER);

        Label num1Label = new Label("1st Number:");
        num1Label.setFont(Font.font("", FontWeight.NORMAL, 16.0));
        center.add(num1Label, 0, 0);

        TextField num1Field = new TextField();
        num1Field.setFont(Font.font("", FontWeight.NORMAL, 16.0));
        num1Label.setLabelFor(num1Field);
        center.add(num1Field, 1, 0);

        Label num2Label = new Label("2nd Number:");
        num2Label.setFont(Font.font("", FontWeight.NORMAL, 16.0));
        center.add(num2Label, 0, 1);

        TextField num2Field = new TextField();
        num2Field.setFont(Font.font("", FontWeight.NORMAL, 16.0));
        num2Label.setLabelFor(num2Field);
        center.add(num2Field, 1, 1);

        /**
         * VBox to contain the operation buttons
         */
        VBox buttons = new VBox();
        root.setLeft(buttons);
        buttons.setPadding(new Insets(0, 20, 0, 0));
        buttons.setAlignment(Pos.CENTER);

        double btnSize = 40;
        Font btnFont = Font.font("", FontWeight.BOLD, 16.0);
        /**
         * array to store the operation buttons
         */
        Button[] btn = new Button[5];
        btn[0] = new Button("+");
        btn[1] = new Button("-");
        btn[2] = new Button("*");
        btn[3] = new Button("/");
        btn[4] = new Button("%");

//        Button add = new Button("+");
//        Button sub = new Button("-");
//        Button mul = new Button("*");
//        Button div = new Button("/");
//        Button mod = new Button("%");
//        add.setPrefSize(btnSize, btnSize);
//        add.setFont(btnFont);
//        sub.setPrefSize(btnSize, btnSize);
//        sub.setFont(btnFont);
//        mul.setPrefSize(btnSize, btnSize);
//        mul.setFont(btnFont);
//        div.setPrefSize(btnSize, btnSize);
//        div.setFont(btnFont);
//        mod.setPrefSize(btnSize, btnSize);
//        mod.setFont(btnFont);
//        buttons.getChildren().addAll(add, sub, mul, div, mod);
        /**
         * VBox to contain the result label and exit button
         */
        VBox bottom = new VBox(10);
        root.setBottom(bottom);
        bottom.setAlignment(Pos.CENTER);

        Label result = new Label();
        result.setFont(Font.font("", FontWeight.BOLD, 16.0));

        Button exit = new Button("Exit");
        exit.setFont(Font.font("", FontWeight.BOLD, 16.0));
        exit.setOnAction(e -> {
            Platform.exit();
        });

        bottom.getChildren().addAll(result, exit);

        /**
         * setting the preferred size and the font for each button and adding
         * them to the VBox and then setting up the event handler with each
         * button identified by the text in the button (the mathematical
         * operation) and passing it to the handler method
         */
        for (int i = 0; i < btn.length; i++) {
            btn[i].setPrefSize(btnSize, btnSize);
            btn[i].setFont(btnFont);
            buttons.getChildren().add(btn[i]);
            String op = btn[i].getText();
            btn[i].setOnAction(e -> {
                handler(num1Field, num2Field, result, op);
            });
        }

//        add.setOnAction(e -> {
//            handler(num1Field, num2Field, result, "+");
//        });
//        sub.setOnAction(e -> {
//            handler(num1Field, num2Field, result, "-");
//        });
//        mul.setOnAction(e -> {
//            handler(num1Field, num2Field, result, "*");
//        });
//        div.setOnAction(e -> {
//            handler(num1Field, num2Field, result, "/");
//        });
//        mod.setOnAction(e -> {
//            handler(num1Field, num2Field, result, "%");
//        });
        Scene scene = new Scene(root);

        primaryStage.setTitle("Mathematical Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     *
     * @param num1 1st number
     * @param num2 2nd number
     * @param op mathematical operator
     * @return the result of the operation
     */
    public static double calc(double num1, double num2, String op) {
        double res = 0;
        switch (op) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            case "%":
                res = num1 % num2;
                break;
        }
        return res;
    }

    /**
     *
     * @param num1Field
     * @param num2Field
     * @param res
     * @param Operator
     *
     * handles the action event displays an error or the result of the operation
     * in the res Label
     */
    public static void handler(TextField num1Field, TextField num2Field,
            Label res, String Operator) {
        double num1 = 1;
        double num2 = 1;
        double rs;

        // String to store the error message
        String Error = "";
        // boolean to flag if there was an error or not
        boolean err = false;

        if (num1Field.getText().equals("")) {
            Error = "Error: Input #1 can't be empty!";
            err = true;
            System.out.println("empty");
        } else {
            try {
                num1 = Double.parseDouble(num1Field.getText());
            } catch (Exception e) {
                err = true;
                Error = "Error: Input #1 must be a number!";
                System.out.println("string");
            }
        }
        /**
         * checks if num1field had an error, if true appends the error message
         * of num2Field to the previous error message
         * 
         * if false just make the error message about num2Field
         */
        if (err) {
            if (num2Field.getText().equals("")) {
                Error += "\nError: Input #2 can't be empty!";
                err = true;
                System.out.println("empty");
            } else {
                try {
                    num2 = Double.parseDouble(num2Field.getText());
                } catch (Exception e) {
                    err = true;
                    Error += "\nError: Input #2 must be a number!";
                    System.out.println("string");
                }
            }
        } else {
            if (num2Field.getText().equals("")) {
                Error = "Error: Input #2 can't be empty!";
                err = true;
                System.out.println("empty");
            } else {
                try {
                    num2 = Double.parseDouble(num2Field.getText());
                } catch (Exception e) {
                    err = true;
                    Error = "Error: Input #2 must be a number!";
                    System.out.println("string");
                }
            }
        }

        /**
         * checks if num2 is zero, and then checks for the operators 
         * / and %
         */
        if (num2 == 0.0) {
            if (Operator.equals("/")) {
                err = true;
                Error = "Error: Divide by zero is not allowed!";
            }
            if (Operator.equals("%")) {
                err = true;
                Error = "Error: Modulo by zero is not allowed!";
            }
        }

        /**
         * passes to the output method
         * the res label reference, a message and a message type
         */
        if (err) {
            System.out.println("ERROR");
            output(res, Error, "ERROR");
        } else {
            System.out.println("RESULT");
            rs = calc(num1, num2, Operator);
            String result = String.format(
                    "Success: %.2f %s %.2f = %.2f",
                    num1, Operator, num2, rs);
            output(res, result, "RESULT");
            System.out.println(rs);

            // resets the input fields
            num1Field.setText("");
            num2Field.setText("");

        }
    }

    // checks the type of the message to change the color of the text
    // then sets the text in the res label as the out String
    public static void output(Label res, String out, String type) {
        switch (type) {
            case "ERROR":
                res.setTextFill(Color.RED);
                break;
            case "RESULT":
                res.setTextFill(Color.GREEN);
                break;
        }
        res.setText(out);
    }

    public static void main(String[] args) {
        launch();
    }

}
