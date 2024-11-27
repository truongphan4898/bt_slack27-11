public class DepositTransaction extends Transaction {
    private SavingAccount savingAccount;
    private double amount;
    public DepositTransaction(){}
    public DepositTransaction(SavingAccount savingAccount, double amount) {
        this.savingAccount = savingAccount;
        this.amount = amount;
    }

    @Override
    void processTransaction() {
        savingAccount.withdraw(amount);
    }

    @Override
    void printTransactionDetail() {

    }
}
