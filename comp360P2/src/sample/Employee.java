package sample;


//****************************************************************************************************************//
                //Employee Class that the Tech, Eng, and Manager will be inheriting from//
//****************************************************************************************************************//

public abstract class Employee{
    private String lastName;
    private String firstName;
    private String address;
    private String telephone;
    private String ssn;
    private double MonthlyPay;
    protected int overTimeHrs;
    protected double taxRate = .2;
    protected int hoursWorked;
    protected double overTimePay;
    protected boolean chkIncentives;

    private String jobTitle;


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


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setOverTimeHrs(int hoursWorked) {
        if(hoursWorked > 40){
            this.overTimeHrs = hoursWorked - 40;
        }
        else{
            overTimeHrs = 0;
        }
    }

    public int getOverTimeHrs(){
        return overTimeHrs;
    }

    public boolean getChkIncentives() {
        return chkIncentives;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setChkIncentives(boolean chkIncentives) {
        this.chkIncentives = chkIncentives;
    }


    public void setHoursWorked(int hoursWorked) {
        if(jobTitle.equals("Technician")){
            if(hoursWorked > 40) {
                this.hoursWorked = 40;
            }
            else{
                this.hoursWorked = hoursWorked;
            }
        }
        else{
            this.hoursWorked = hoursWorked;
        }
    }


    //****************************************************************************************************************//
                            //toString method to display Employee info to the GUI/
    //****************************************************************************************************************//


    @Override
    public String toString(){

        String info = "\n"
                        +"Name: " + firstName + " " + lastName
                        + "\nAddress: " +  address
                        + "\nTelephone: " + telephone
                        + "\nSSN: " + ssn
                        + "\nJob Title: " + jobTitle
                        + "\n";
        return info;
    }

}
