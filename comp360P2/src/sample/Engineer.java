package sample;


//****************************************************************************************************************//
                                //Engineer Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Engineer extends Employee {

    //private int hoursWorked;
    private double hourlyWage = 40.0;
    //private boolean newProfitProduct = getChkIncentives();
    private int bonus;
    private double toTax;
    private double taxes;
    private double monthlyPayment;

   /* public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = this.getHoursWorked();
    }
*/

   public int getBonus(){
       return  bonus;
   }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public int calculateBonusElig(){
        if (chkIncentives){
            bonus = 10000;
            return bonus;
        }
        else{
            bonus = 0;
            return bonus;
        }
    }


    public void calculateMonthlyPayment(){
        if(chkIncentives){
             toTax = hoursWorked * hourlyWage + calculateBonusElig();
             taxes = toTax * taxRate;
            monthlyPayment = toTax - taxes;
        }else{
            toTax = hoursWorked * hourlyWage;
            taxes = toTax * taxRate;
            monthlyPayment = toTax - taxes;
        }
    }

    //calculate
//    protected double actualPayment(int taxRate, double monthPayment){
//        double afterTax = monthPayment * taxRate;
//        monthlyPayment = monthPayment - afterTax;
//        return monthlyPayment;
//    }

    //****************************************************************************************************************//
    //toString method to display Employee info to the GUI/
    //****************************************************************************************************************//

    public String toString(){

        String info = "Pay for the month: " + monthlyPayment
                        + "\nBonusEligible: " + chkIncentives
                        + "\nBonus: $" + bonus
                        + "\n \n ";

        return super.toString() + info;
    }
}

