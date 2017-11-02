package sample;

import java.util.ArrayList;



public class employeeList {

    private ArrayList<EmployeeInfo>  eList;

    EmployeeInfo e = new EmployeeInfo();

    public employeeList(){
        eList = new ArrayList<EmployeeInfo>();
    }


    public void getEmployee(String fName){
        e.setFirstName(fName);
        System.out.println(e.getFirstName());
    }






}


