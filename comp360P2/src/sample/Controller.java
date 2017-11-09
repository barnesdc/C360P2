/**
 * Sample Skeleton for 'EmployeeInfoPage.fxml' Controller Class
 */

package sample;

import java.io.Console;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;


public class Controller {

    //****************************************************************************************************************//
                                    //Declarations for actual buttons from form//
    //****************************************************************************************************************//

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private TextArea textarea;  //textArea box

    @FXML
    private TextField empCount;

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
    private ComboBox<String> jobCombo; // Value injected by FXMLLoader

    @FXML // fx:id="btnExit"
    private Button btnExit; // Value injected by FXMLLoader

    @FXML // fx:id="txtBigDisplay"
    public TextField txtBigDisplay;


    employeeList e = new employeeList(); // init arraylist
    boolean chkIncentives;               // boolean value to get checkbox values
    int hours = 0;                       // initialize hours

    //****************************************************************************************************************//
                                        //Handlers for buttons//
    //****************************************************************************************************************//

    // Method for submit button
    // Receives all inputs from TextFields and Checkboxes and places into employeeArraylist
    @FXML
    void handleSubmit(ActionEvent event) {
        btnSubmit.setOnAction(event1 -> {
            String fName = txtFirstName.getText();
            String lName = txtLastName.getText();
            String addy = txtAddress.getText();
            String phone = txtPhone.getText();
            hours = Integer.parseInt(txtHrsWorked.getText());
            //String hours = txtHrsWorked.getText();
            String ssn = txtSSN.getText();

            // create if state to assign job from comboBox
            // set condition for incentives
            String job = jobCombo.getSelectionModel().getSelectedItem();
            switch (job) {
                case "Manager":
                    if (chkSucManager.isSelected()) chkIncentives = true;
                    else chkIncentives = false;
                    chkNewProduct.setSelected(false);
                    break;
                case "Engineer":
                    if (chkNewProduct.isSelected()) chkIncentives = true;
                    else chkIncentives = false;
                    chkSucManager.setSelected(false);
                    break;
                default:
                    chkIncentives = false;
                    break;
            }
            empCount.setText(String.valueOf(e.getCount()));
            e.getEmployee(fName,lName,addy,phone,ssn, hours, job, chkIncentives); //calls methods from employee class
        });
    }

    // Method to clear all items on form
    @FXML
    void handleClear(ActionEvent event) {
        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    txtFirstName.clear();
                    txtLastName.clear();
                    txtAddress.clear();
                    txtPhone.clear();
                    txtHrsWorked.clear();
                    txtOvertime.clear();
                    txtSSN.clear();
                    jobCombo.getSelectionModel().clearSelection();
                    chkNewProduct.setSelected(false);
                    chkSucManager.setSelected(false);
                    textarea.clear();
            }
        });
    }

    // Method to exit the program
    @FXML
    void handleExit(ActionEvent event) {
        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
                // Figure out if there is a better way to exit the program
                // Is it normal for double click all buttons to exit, submit, etc
            }
        });
    }


    @FXML
    void handleDisplay(ActionEvent event) {
        btnDisplay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

               textarea.setText(String.valueOf(e.getDisplay()));

               if(String.valueOf(e.t.getOverTimeHrs()).equals("0")){
                   txtOvertime.setText("0");
                }
                else{
               txtOvertime.setText(String.valueOf(e.t.getOverTimeHrs()));
               }
            }

        });


    }

    //****************************************************************************************************************//
                    //Need to figure out is this good indications--> in reference to green//
    //****************************************************************************************************************//
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert chkNewProduct != null : "fx:id=\"chkNewProduct\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert chkSucManager != null : "fx:id=\"chkSucManager\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtOvertime != null : "fx:id=\"txtOvertime\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnDisplay != null : "fx:id=\"btnDisplay\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtHrsWorked != null : "fx:id=\"txtHrsWorked\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtLastName != null : "fx:id=\"txtLastName\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtFirstName != null : "fx:id=\"txtFirstName\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnSubmit != null : "fx:id=\"btnSubmit\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert txtSSN != null : "fx:id=\"txtSSN\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert jobCombo != null : "fx:id=\"Jobcombo\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'EmployeeInfoPage.fxml'.";

    }
}