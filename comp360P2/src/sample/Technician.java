package sample;



//****************************************************************************************************************//
                                //Technician Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Technician extends Employee{

    private int hoursWorked;
    private double hourlyWage = 30.0;
    private int overTimeHrs;
    private double monthPayment;
    public double overTimePay;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked() {
        hoursWorked = this.getHoursWorked();
    }

    public int getOverTimeHrs() {
            return overTimeHrs;
        }

    public int calculateOverTimeHrs(int hoursWorked){
        if(hoursWorked > 40){
            overTimeHrs = hoursWorked - 40;
            return overTimeHrs;
        }
        else{
            return overTimeHrs = 0;
        }
    }

    public double overtimePay(double overTimeRate, int overTimeHrs){
        return overTimePay = overTimeHrs * overTimeRate;
    }

    public double calculateMonthPayment(){
        if(overTimeHrs == 0){
            monthPayment =  hoursWorked * hourlyWage;
            return monthPayment;
        }
        else{
            monthPayment = hoursWorked * hourlyWage + overtimePay(overTimeRate, overTimeHrs);
            return monthPayment;
        }
    }
}

