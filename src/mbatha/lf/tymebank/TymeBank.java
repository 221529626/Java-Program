
package mbatha.lf.tymebank;

import javax.swing.JOptionPane;

public class TymeBank {

    private double openingBalance;
    private String transDate;
    private double transAmount;
    private String transType;
   
    
    public TymeBank()
    {
        this.openingBalance = 0;
        this.transDate = "";
        this.transAmount = 0;
        this.transType = "";
        
    }
    public TymeBank(double openingBalance,String transDate,double transAmount,String transType){
        
        this.openingBalance = openingBalance;
        this.transDate = transDate;
        this.transAmount = transAmount;
        this.transType = transType;
        
    }
    //Methods for OpeningBalance
    public void SetOpeningBalance(double openingBalance){
         this.openingBalance = openingBalance;
    }
    public double GetOpeningBalance(){
        return openingBalance;
    }
    //Methods for TransDate
     public void SetTransDate(String transDate){
         this.transDate = transDate;
    }
     public String GetTransDate(){
         return transDate;
     }
     //Methods for TransAmount
      public void SetTransAmount(double transAmount){
         this.transAmount = transAmount;
    }
      public double GetTransAmount(){
          return transAmount;
       }
      //Methods for TransType
       public void SetTransType(String transType){
         this.transType = transType;
        }
      public String GetTransType(){
          return transType = transType;
        }
      
      //helper method
        public double calculateNewBalance(double amount) {
            if(transType==("Cheque")){
                if(openingBalance > amount){
                double newBalance =  openingBalance - amount;
                return newBalance;
                }
                else{
                        JOptionPane.showMessageDialog(null, "Insuffient funds\nYour balance is less than amount Chequed");
                    }
            }
            else{
                if(transType==("ATM cash withdrawal")){
                    if(openingBalance > amount){
                double newBalance =  openingBalance - amount;
                return newBalance;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insuffient funds\nYour balance is less than amount withdrawed");
                    }
                }
                else if(transType==("Cash deposits")){
                double newBalance =  openingBalance + amount;
                return newBalance;
            }
                
            }
            return openingBalance;
        }
        public double closingBalance(double interest,double newBalance) {
        double closingBalance =  newBalance + interest;
        return closingBalance;
        }
        
       
}
