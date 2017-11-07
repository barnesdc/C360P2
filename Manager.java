package sample;



//****************************************************************************************************************//
                                        //Manager Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Manager extends Employee {
    private double yearlySalary = 100000;
    private boolean excellentRating;
    private double salaryBonus = .03;

    public double calculateMonthPay() {
        if (excellentRating) {
            monthPay = (yearlySalary / 12) * salaryBonus;
            return monthPay;
        } else {
            monthPay = yearlySalary / 12;
            return monthPay;
        }
    }
}