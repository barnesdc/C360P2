package sample;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


//****************************************************************************************************************//
                    //Main method creates and sets stage for the form, then shows it//
//****************************************************************************************************************//
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("EmployeeInfoPage.fxml"));
        primaryStage.setTitle("Employee Payroll System");
        primaryStage.setScene(new Scene(root, 600, 350));
        primaryStage.show();


    }




        //List<EmployeeInfo> employee = new ArrayList<EmployeeInfo>();
}