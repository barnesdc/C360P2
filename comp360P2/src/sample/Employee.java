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
    private double netMonthlyPay;
    public double overTimeRate = 2.5;
    public double taxRate = .2;


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


    protected double actualPayment(int taxRate, double monthPayment){
        double afterTax = monthPayment * taxRate;
        netMonthlyPay = monthPayment - afterTax;

        return netMonthlyPay;

    }
}
