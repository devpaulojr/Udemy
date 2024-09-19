public class AccountBank {

    private int accountNumber;
    public String accountTitle;
    public char decision;
    private double initialValue;

    public AccountBank(){

    }

    public AccountBank(int accountNumber, String accountTitle, char decision, double initialValue){
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.decision = decision;
        this.initialValue = initialValue;
    }

    public AccountBank(int accountNumber, char decision, String accountTitle){
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.decision = decision;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialValue(){
        return initialValue;
    }

    public void setInitialValue(double initialValue){
        this.initialValue = initialValue;
    }

    public double AddMoney(double money){
        return initialValue += money;
    }

    public double TaxMoney(){
        return initialValue -= 5.0;
    }

    public double Removemoney(double money){
        return initialValue -= initialValue + (money - TaxMoney());
    }


    public String toString(){
        return "Account: " + accountNumber + ", " + "Holder: " + accountTitle + ", " + "Balence: $ " + String.format(
                "%.2f", initialValue);
    }

}
