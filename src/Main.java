import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<BankAccount>bankAccounts=new ArrayList<>();
        SavingAccount savingAccount = new SavingAccount(9L,"truong",10000.0,0.05);
        CheckingAccount checkingAccount = new CheckingAccount(10L,"truong",10000.0,1000000);

        DepositTransaction depositTransaction = new DepositTransaction(savingAccount,500.0);
        depositTransaction.processTransaction();

        WithdrawTransaction withdrawTransaction = new WithdrawTransaction(checkingAccount,50000.0);
        withdrawTransaction.processTransaction();


    }
}