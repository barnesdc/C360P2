/**
 * Sample Skeleton for 'EmployeeInfoPage.fxml' Controller Class
 */

package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.*;


public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="chkNewProduct"
    private CheckBox chkNewProduct; // Value injected by FXMLLoader

    @FXML // fx:id="chkSucManager"
    private CheckBox chkSucManager; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="txtOvertime"
    private TextField txtOvertime; // Value injected by FXMLLoader

    @FXML // fx:id="chkOvertime"
    private CheckBox chkOvertime; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="btnDisplay"
    private Button btnDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="txtHrsWorked"
    private TextField txtHrsWorked; // Value injected by FXMLLoader

    @FXML // fx:id="txtLastName"
    private TextField txtLastName; // Value injected by FXMLLoader

    @FXML // fx:id="txtFirstName"
    private TextField txtFirstName; // Value injected by FXMLLoader

    @FXML // fx:id="btnSubmit"
    private Button btnSubmit; // Value injected by FXMLLoader

    @FXML // fx:id="txtSSN"
    private TextField txtSSN; // Value injected by FXMLLoader

    @FXML // fx:id="Jobcombo"
    private ComboBox<?> Jobcombo; // Value injected by FXMLLoader

    @FXML // fx:id="btnExit"
    private Button btnExit; // Value injected by FXMLLoader

    employeeList e = new employeeList(); // init arraylist

    @FXML
    void handleSubmit(ActionEvent event) {
        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String fName = txtFirstName.getText();
                e.getEmployee(fName);
            }
        });
    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleExit(ActionEvent event) {
        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }


    @FXML
    void handleDisplay(ActionEvent event) {
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert chkNewProduct != null : "fx:id=\"chkNewProduct\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert chkSucManager != null : "fx:id=\"chkSucManager\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtOvertime != null : "fx:id=\"txtOvertime\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert chkOvertime != null : "fx:id=\"chkOvertime\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnDisplay != null : "fx:id=\"btnDisplay\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtHrsWorked != null : "fx:id=\"txtHrsWorked\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtLastName != null : "fx:id=\"txtLastName\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtFirstName != null : "fx:id=\"txtFirstName\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnSubmit != null : "fx:id=\"btnSubmit\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtSSN != null : "fx:id=\"txtSSN\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert Jobcombo != null : "fx:id=\"Jobcombo\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";

    }
}