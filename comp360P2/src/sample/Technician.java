package sample;


//****************************************************************************************************************//
//Technician Class that inherits from Employee//
//****************************************************************************************************************//

public class Technician extends Employee {

    //private int hoursWorked;
    private double hourlyWage = 30.0;
    private double toTax;
    private double taxes;

    public Technician() {
        monthlyPayment = 0;
        overTimeRate = 2.5;
    }

    public double getOverTimePay() {
        return overTimePay;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    private double overTimeRate;
    private double monthlyPayment;


    public double calculateOverTimePay() {
        return overTimePay = overTimeHrs * overTimeRate * hourlyWage;
    }

    public void calculateMonthPayment() {
        toTax = hoursWorked * hourlyWage + calculateOverTimePay();
        taxes = toTax * taxRate;
        monthlyPayment = toTax - taxes;
    }

    //****************************************************************************************************************//
    //toString method to display Employee info to the GUI/
    //****************************************************************************************************************//

    public String toString(){

        String info = "Pay for the month: " + monthlyPayment
                + "\nOvertime Hrs: " + overTimeHrs
                + "\nOvertime Pay:  $" + overTimePay
                + "\n \n";

        return super.toString() + info;
    }



}

