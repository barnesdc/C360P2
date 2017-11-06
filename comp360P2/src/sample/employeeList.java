package sample;

import java.util.ArrayList;


//****************************************************************************************************************//
                                    //ArrayList Class//
//****************************************************************************************************************//
public class employeeList {

    // Creates arrayList
    private ArrayList<Employee>  eList;
    Employee e = new Employee();

    Technician t = new Technician();
    Engineer eng = new Engineer();
    Manager m = new Manager();

    // arrayList constructor
    public employeeList(){
        eList = new ArrayList<Employee>();
    }

    // getEmployee method to pull in items from form
    public void getEmployee(String fName, String lName, String addy, String phone, String ssn, String hoursWorked){
        e.setFirstName(fName);
        e.setLastName(lName);
        e.setAddress(addy);
        e.setTelephone(phone);
        e.setSsn(ssn);
        //e.setHoursWorked(hoursWorked);

        //Use for technician
        //hours - 40  --> anything left is overtime, pass to technician
        //if overtime is < 0 --> treat as if 0
        //same thing for both bonus booleans


        System.out.println("Name: " + e.getFirstName() + " " +  e.getLastName()
                + " \nAddress: " +  e.getAddress() +
                " \nTelephone: " +  e.getTelephone() +
                " \nSSN: " +  e.getSsn());
        System.out.println();
        //print size of array list to verify its actually increasing
    }

    public void getPay(){

    }

}


