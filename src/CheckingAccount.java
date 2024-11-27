public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(){}
    public CheckingAccount(Long numberAccount, String accountHolder, Double balance, double overdraftLimit) {
        super(numberAccount, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(Double amount) {
        if (amount == null || amount <= 0){
            System.out.println("Amount cannot be negative");
            return;
        }
        if(this.getBalance()>amount){
            this.setBalance(this.getBalance() - amount);
            System.out.println("Transaction successful. New balance: " +this.getBalance());
            return;
        }
        double newBalance = this.getBalance() - amount;
        if(Math.abs(newBalance)>this.getOverdraftLimit()){
            System.out.println("Overdraft limit exceeded.");
            return;
        }
        this.setBalance(newBalance);
        System.out.println("Transaction successful. New balance: "+this.getBalance());
    }
}
