package sample;



//****************************************************************************************************************//
                                        //Manager Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Manager extends Employee{
    private double yearlySalary = 100000;
    private boolean excellentRating;
    private double salaryBonus = .03;
    private double actualBonus;

    public double getYearlySalary(){
        return yearlySalary;
    }
    protected void setAnnualSalary(int monthPayment){
        yearlySalary = this.getYearlySalary();

    }
    public double getSalaryBonus(){
        return actualBonus;
    }
    public void setSalaryBonus(){
        if(excellentRating){
            actualBonus = this.getYearlySalary() * salaryBonus;
        }

    }
}
