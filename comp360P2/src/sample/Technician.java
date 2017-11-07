package sample;



//****************************************************************************************************************//
                                //Technician Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Technician extends EmployeeInfo{

    private int overTimeHrs;


    public int get() {
            return overTimeHrs;
        }

    public void setOverTimeHrs(int hoursWorked){
        hoursWorked = this.getHoursWorked();
        overTimeHrs = hoursWorked - 40;
        if (overTimeHrs < 0)
            overTimeHrs = 0;
    }

    public double overtimePay(double overTimeRate, int overTimeHrs){
        double overTimePay = overTimeHrs * overTimeRate;

        return overTimePay;
    }

    @Override
    public void setMonthlyPayment(double hourlyRate, int hoursWorked){

    }
}

