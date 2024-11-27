public class WithdrawTransaction extends Transaction{
    private CheckingAccount checkingAccount;
    private double amount;
    public WithdrawTransaction(CheckingAccount checkingAccount, double amount) {
        this.checkingAccount = checkingAccount;
        this.amount = amount;
    }

    @Override
    void processTransaction() {
        checkingAccount.withdraw(amount);
    }

    @Override
    void printTransactionDetail() {

    }
}
