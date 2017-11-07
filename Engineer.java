package sample;


//****************************************************************************************************************//
                                //Engineer Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Engineer extends Employee {

    private double hourlyWage = 40.0;
    private boolean newProfitProduct;
    private int bonus = 10000;

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
            monthPay = hoursWorked * hourlyWage + bonus;
            return monthPay;
        }else{
            monthPay = hoursWorked * hourlyWage;
            return monthPay;
        }
    }
}

