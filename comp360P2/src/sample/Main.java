package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



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