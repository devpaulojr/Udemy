public class AccountBank {

    private int accountNumber;
    public String accountTitle;
    private double initialValue;

    public AccountBank(){

    }

    public AccountBank(int accountNumber, String accountTitle, double initialValue){
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.initialValue = initialValue;
    }

    public AccountBank(int accountNumber, String accountTitle){
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getInitialValue(){
        return initialValue;
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
