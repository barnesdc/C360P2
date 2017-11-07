package sample;


//****************************************************************************************************************//
                //Employee Class that the Tech, Eng, and Manager will be inheriting from//
//****************************************************************************************************************//

public class Employee{
    private String lastName;
    private String firstName;
    private String address;
    private String telephone;
    private String ssn;
    public double monthPay;
    private double annualGrossPay;
    private double annualNetPay;
    public int hoursWorked;
    public double hourlyWage;
    public int overTimeHrs;
    public double overTimePay;
    public double overTimeRate = 2.5;
    public double taxRate = .2;
/*
    public EmployeeInfo(double empHourlyRate,
                           int empHoursWorked,
                        double empMonthPayment,
                        String empLastName,
                        String empFirstName,
                        String empAddress,
                        String empTelephone,
                        String empSSN,
                        String empJob,
                        double empYearlySalary,
                        double empNetMonthPay,
                        double empTaxRate){

        lastName    = empLastName;
        firstName   = empFirstName;
        address     = empAddress;
        telephone   = empTelephone;
        ssn         = empSSN;
        hourlyRate  = empHourlyRate;
        hoursWorked = empHoursWorked;
        monthPayment= empMonthPayment;
        job         = empJob;

    }
*/

    //****************************************************************************************************************//
                                    //Getters and Setters for data input/
    //****************************************************************************************************************//

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    protected double calculateAnnualNetPay(){
        annualNetPay = monthPay * 12;
        return annualNetPay;
    }
    protected double actualAnnualGrossPay(int taxRate, double monthPayment){
        double afterTax = monthPay * taxRate;
        annualGrossPay = (monthPay - afterTax) * 12;
        return annualGrossPay;

    }
}
