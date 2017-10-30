package sample;

public class Engineer extends EmployeeInfo {

    private boolean newProfitProduct;
    private int productBonus;

    public Engineer(double empHourlyRate, int empHoursWorked, double empMonthPayment, String empLastName, String empFirstName, String empAddress, String empTelephone, String empSSN, String empJob, double empYearlySalary, double empNetMonthPay, double empTaxRate) {
        super(empHourlyRate, empHoursWorked, empMonthPayment, empLastName, empFirstName, empAddress, empTelephone, empSSN, empJob, empYearlySalary, empNetMonthPay, empTaxRate);
    }
}

