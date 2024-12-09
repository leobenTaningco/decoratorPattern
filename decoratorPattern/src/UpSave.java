public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(SavingsAccount account) {
        this.bankAccount = account;
    }
    @Override
    public void setBankAccount(BankAccount bankAccount) {
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }
    @Override
    public double getInterestRate(){
        return 0.04;
    }

    public double getBalance(){
        return bankAccount.getBalance();
    }

    public String showBenefits(){
        return bankAccount.showBenefits() + ", With Insurance";
    }

    public double computeBalanceWithInterest(){
        return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate());
    }

    public String showInfo(){
        return bankAccount.showInfo();
    }
    

}
