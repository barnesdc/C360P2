package sample;



//****************************************************************************************************************//
                                        //Manager Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Manager extends Employee{

    private double yearlySalary;
    private double actualSalary;
    private double salaryBonus;
    private double actualBonus;
    private double monthlyPayment;
    private double toTax;
    private double taxes;

    public Manager() {
        salaryBonus = .03;
        yearlySalary = 100000;
    }


    public double getYearlySalary(){
        return yearlySalary;
    }

    public double getActualBonus(){
        return  actualBonus;
    }


    public void calculateAnnualSalary(){
        double temp = yearlySalary + calculateSalaryBonus();
        actualSalary = Math.round(temp * 100)/100D;
    }


    public double calculateSalaryBonus(){
        if(chkIncentives){
            actualBonus = Math.round(yearlySalary * salaryBonus);
            return actualBonus;
        }
        else{
            actualBonus = 0;
            return actualBonus;
        }
    }


    public double calculateMonthlyPayment() {
        double temp = yearlySalary / 12;
        taxes = temp * taxRate;
        monthlyPayment = temp - taxRate;
        return monthlyPayment = Math.round(temp * 100)/100D;
    }

    //****************************************************************************************************************//
    //toString method to display Employee info to the GUI/
    //****************************************************************************************************************//

    public String toString(){

        String info ="Pay for the month: " + monthlyPayment
                        + "\nBonusEligible: " + chkIncentives
                        + "\nBonus: $" + actualBonus
                        + "\nAnnual Pay (before tax): $" + actualSalary + taxRate
                        + "\n \n ";

        return super.toString() + info;
    }
}
