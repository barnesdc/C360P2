package sample;

//import sun.jvm.hotspot.debugger.Address;

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
    protected double yearlySalary;
    protected double netMonthPay;

    public double taxRate = .2;

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


    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private String getTelephone() {
        return telephone;
    }

    private void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String jobTitle(){
        //input validation for whether or not they inputted the correct job
        return job;
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
    protected double annualSalary(int monthPayment){
        yearlySalary = monthPayment * 12;

        return yearlySalary;
    }
    protected double actualPayment(int taxRate, double monthPayment){
        double afterTax = monthPayment * taxRate;
        netMonthPay = monthPayment - afterTax;

        return netMonthPay;

    }
}
