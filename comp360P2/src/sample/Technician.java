package sample;



//****************************************************************************************************************//
                                //Technician Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Technician extends EmployeeInfo{

    private double overTimeRate = 2.5;
    private double overTimePay;
    public int overTimeHrs;


    public int getOverTimeHrs() {
            return overTimeHrs;
        }

    public void setOverTimeHrs(int hoursWorked){
        hoursWorked = this.getHoursWorked();
        overTimeHrs = hoursWorked - 40;
    }

    public double overtimePay(double overTimeRate, int overTimeHrs){
        overTimePay = overTimeHrs * overTimeHrs;

        return overTimePay;
    }
}

