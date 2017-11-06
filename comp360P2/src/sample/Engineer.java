package sample;


//****************************************************************************************************************//
                                //Engineer Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Engineer extends Employee {

    private int hoursWorked;
    private double hourlyWage = 40.0;
    private boolean newProfitProduct;
    private int bonus = 10000;
    private double monthPayment;

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(){
        hoursWorked = this.getHoursWorked();
    }

    public int getBonusElig(){
       return bonus;
    }
    public void setBonusElig(){
        if (newProfitProduct){
            bonus = 10000;
        }
        else{
            bonus = 0;
        }
    }

    public double calculateMonthlyPayment(){
        if(newProfitProduct){
            monthPayment = hoursWorked * hourlyWage + bonus;
            return monthPayment;
        }else{
            monthPayment = hoursWorked * hourlyWage;
            return monthPayment;
        }
    }
}

