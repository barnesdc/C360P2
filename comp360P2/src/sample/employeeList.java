package sample;

import java.util.ArrayList;


//****************************************************************************************************************//
                                    //ArrayList Class//
//****************************************************************************************************************//
public class employeeList {

    // Creates arrayList
    private ArrayList<EmployeeInfo>  eList;
    //EmployeeInfo e = new EmployeeInfo();

    Technician t = new Technician();
    Engineer eng = new Engineer();
    Manager m = new Manager();

    // arrayList constructor
    public employeeList(){
        eList = new ArrayList<>();
    }

    // getEmployee method to pull in items from form
    public void getEmployee(String fName, String lName, String addy, String phone, String ssn, int hoursWorked, String job){


        String sΩ2wwwzzjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj = job;
        if(s.equals("Technician")){
            t.setJobTitle(s);
            t.setFirstName(fName);
            t.setLastName(lName);
            t.setAddress(addy);
            t.setTelephone(phone);
            t.setSsn(ssn);
            t.setHourlyRate(job);
            t.setHoursWorked(hoursWorked);
            //t.getMonthlyPayment();
            eList.add(t);
        }
        if(s.equals("Engineer")){
            eng.setJobTitle(s);
            eng.setFirstName(fName);
            eng.setLastName(lName);
            eng.setAddress(addy);
            eng.setTelephone(phone);
            eng.setSsn(ssn);
            //eng.getMonthlyPayment();
            eList.add(eng);
        }
        if(s.equals("Manager")){
            m.setJobTitle(s);
            m.setFirstName(fName);
            m.setLastName(lName);
            m.setAddress(addy);
            m.setTelephone(phone);
            m.setSsn(ssn);
            //t.setMonthlyPayment(hoursWorked);
            eList.add(m);

        }
        for(int i = 0; i < eList.size(); i++){
            System.out.println(eList.get(i));
        }
        //e.setHoursWorked(hoursWorked);

        //Use for technician
        //hours - 40  --> anything left is overtime, pass to technician
        //if overtime is < 0 --> treat as if 0
        //same thing for both bonus booleans

        /*
        System.out.println("Name: " + t.getFirstName() + " " +  t.getLastName()
                + " \nAddress: " +  t.getAddress() +
                " \nTelephone: " + t.getTelephone() +
                " \nSSN: " +  t.getSsn() +
                " \nJob Title: " + t.getJobTitle() +
                " \nPay for the month: " + t.getMonthlyPayment());
        System.out.println();
        //
        System.out.println("Name: " + eng.getFirstName() + " " +  eng.getLastName() +
                " \nTelephone: " + eng.getTelephone() +
                " \nSSN: " +  eng.getSsn() +
                " \nJob Title: " + eng.getJobTitle() +
                " \nPay for the month: " + eng.getMonthlyPayment());

        System.out.println();

        System.out.println("Name: " + m.getFirstName() + " " +  m.getLastName()
                + " \nAddress: " +  m.getAddress() +
                " \nTelephone: " + m.getTelephone() +
                " \nSSN: " +  m.getSsn() +
                " \nJob Title: " + m.getJobTitle() +
                " \nPay for the month: " + m.getMonthlyPayment());
        System.out.println();*/
        //print size of array list to verify its actually increasing
    }

    public ArrayList<EmployeeInfo> displayEmployee(){
        //for ( EmployeeInfo elem : eList){
          //  System.out.println(t);
        //}
        for(int i = 0; i < eList.size(); i++){
            System.out.println(eList.get(i));
        }
        return eList;
    }

}


