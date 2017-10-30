package sample;

public class Technician extends EmployeeInfo{

    private double overTimeRate = 2.5;
    private double overTimePay;
    public int overTimeHrs;

    public Technician(double empHourlyRate, int empHoursWorked, double empMonthPayment, String empLastName, String empFirstName, String empAddress, String empTelephone, String empSSN, String empJob, double empYearlySalary, double empNetMonthPay, double empTaxRate) {
        super(empHourlyRate, empHoursWorked, empMonthPayment, empLastName, empFirstName, empAddress, empTelephone, empSSN, empJob, empYearlySalary, empNetMonthPay, empTaxRate);
    }

    public int getOverTimeHrs() {
        return overTimeHrs;
    }
    public void setO

    public double overtimePay(double overTimeRate, int overTimeHrs, double monthlyPay){


        return overTimePay;
    }
}

