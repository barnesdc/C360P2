package sample;

import java.util.ArrayList;
import java.util.Iterator;


//****************************************************************************************************************//
                                    //ArrayList Class//
//****************************************************************************************************************//
public class employeeList {

    // Create a an employee array list
    private ArrayList<Employee>  eList;

    // Create object for each type of employee
    Technician t = new Technician();
    Engineer eng = new Engineer();
    Manager m = new Manager();

    // arrayList constructor
    public employeeList(){
        eList = new ArrayList<Employee>();
    }

    // getEmployee method to pull in items from TextFields/CheckBoxes from form
    public void getEmployee(String fName, String lName, String addy, String phone, String ssn, int hoursWorked, String job, boolean chkIncentives) {


        String s = job;
        if (s.equals("Technician")) {
            t.setJobTitle(s);
            t.setFirstName(fName);
            t.setLastName(lName);
            t.setAddress(addy);
            t.setTelephone(phone);
            t.setSsn(ssn);
            t.setHoursWorked(hoursWorked);
            t.setOverTimeHrs(hoursWorked);
            t.calculateMonthPayment();
            eList.add(t);
        }
        if (s.equals("Engineer")) {
            eng.setJobTitle(s);
            eng.setFirstName(fName);
            eng.setLastName(lName);
            eng.setAddress(addy);
            eng.setTelephone(phone);
            eng.setSsn(ssn);
            eng.setHoursWorked(hoursWorked);
            eng.setChkIncentives(chkIncentives);
            eng.calculateMonthlyPayment();
            eng.calculateBonusElig();
            eList.add(eng);
        }
        if (s.equals("Manager")) {
            m.setJobTitle(s);
            m.setFirstName(fName);
            m.setLastName(lName);
            m.setAddress(addy);
            m.setTelephone(phone);
            m.setSsn(ssn);
            m.setHoursWorked(hoursWorked);
            m.calculateMonthlyPayment();
            m.setChkIncentives(chkIncentives);
            m.calculateAnnualSalary();
            eList.add(m);
        }

        //System.out.println("Size of array list " + eList.size());

    }

    public String getDisplay(){
        return eList.toString();
    }

    public String getCount(){
        String count = Integer.toString(eList.size()+1);
        return count;
    }
}

//****************************************************************************************************************//
                    //Use below for testing TextField input and object creation//
//****************************************************************************************************************//

        /*
        System.out.println("Name: " + t.getFirstName() + " " + t.getLastName()
                + " \nAddress: " + t.getAddress() +
                " \nTelephone: " + t.getTelephone() +
                " \nSSN: " + t.getSsn() +
                " \nJob Title: " + t.getJobTitle() +
                " \nPay for the month: $" + t.calculateMonthPayment() +
                " \nOvertime Pay:  $"     + t.calculateOverTimePay());
        System.out.println();
        //


        System.out.println("Name: " + eng.getFirstName() + " " +  eng.getLastName() +
                " \nTelephone: " + eng.getTelephone() +
                " \nSSN: " +  eng.getSsn() +
                " \nJob Title: " + t.getJobTitle() +
                " \nPay for the month: " + eng.calculateMonthlyPayment()+
                " \nBonusEligible: " + eng.getChkIncentives() +
                " \nBonus: $" + eng.calculateBonusElig());
        System.out.println();

        System.out.println("Name: " + m.getFirstName() + " " +  m.getLastName()
                + " \nAddress: " +  m.getAddress() +
                " \nTelephone: " + m.getTelephone() +
                " \nSSN: " +  m.getSsn() +
                " \nJob Title: " + t.getJobTitle() +
                " \nPay for the month: " + m.calculateMonthlyPayment() +
                " \nBonusEligible: " + m.chkIncentives +
                        " \nBonus: $" + m.calculateSalaryBonus() +
                " \nSalary : $ " + m.calculateAnnualSalary());
        System.out.println();*/
//print size of array list to verify its actually increasing


