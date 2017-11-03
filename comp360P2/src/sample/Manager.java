package sample;



//****************************************************************************************************************//
                                        //Manager Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Manager extends EmployeeInfo{
    private boolean excellentRating;
    private double salaryBonus = .03;
    private double actualBonus;


    public double getSalaryBonus(){
        return actualBonus;
    }
    public void setSalaryBonus(){
        if(excellentRating){
            actualBonus = this.getYearlySalary();
        }

    }
}
