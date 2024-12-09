public class SavingsAccount implements BankAccount{
    int accountNumber;
    String accountName;
    double balance;

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String showAccountType(){
        return "Savings account";
    }

    public double getInterestRate(){
        return 0.01;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public String showBenefits(){
        return "Standard Savings Account";
    }

    public double computeBalanceWithInterest(){
        return balance + (balance * getInterestRate());
    }

    public String showInfo(){
        return 
        "Account number: " + accountNumber +
        "\nAccount name: " + accountName +
        "\nBalance: " + balance
        ;
    }
}