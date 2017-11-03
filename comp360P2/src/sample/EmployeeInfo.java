package sample;


//****************************************************************************************************************//
                //Employee Class that the Tech, Eng, and Manager will be inheriting from//
//****************************************************************************************************************//

public class EmployeeInfo{

    private double hourlyRate;
    private int hoursWorked;
    private double monthPayment;
    private String lastName;
    private String firstName;
    private String address;
    private String telephone;
    private String ssn;
    private String job;
    private double yearlySalary;
    private double netMonthPay;

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

    public String getJobTitle(){
        return job;
    }
    public void setJobTitle(){
        //get from check box
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    protected double monthlyPayment(String job,  double hourlyRate, int hoursWorked){

        //Check what position the employee holds, hourlyRate will be different per employee position
        //Calculate payment for the month
        //Return payment for the month
        switch (this.job) {
            case "technician":
                hourlyRate = 30;
                break;
            case "engineer":
                hourlyRate = 40;
                break;
            default:
                hourlyRate = 50;
                break;
        }
        monthPayment = hoursWorked * hourlyRate * 4;
        return monthPayment;
    }

    public double getYearlySalary(){
        return yearlySalary;
    }
    protected void setAnnualSalary(int monthPayment){
        yearlySalary = monthPayment * 12;

    }

    protected double actualPayment(int taxRate, double monthPayment){
        double afterTax = monthPayment * taxRate;
        netMonthPay = monthPayment - afterTax;

        return netMonthPay;

    }
}
