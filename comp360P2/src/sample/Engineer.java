package sample;


//****************************************************************************************************************//
                                //Engineer Class that inherits from EmployeeInfo//
//****************************************************************************************************************//

public class Engineer extends EmployeeInfo {

    private boolean newProfitProduct;
    private int productBonus;

    public int getBonusElig(){
       return productBonus;
    }
    public void setBonusElig(){
        if (newProfitProduct){
            productBonus = 10000;
        }
        else{
            productBonus = 0;
        }
    }

}

