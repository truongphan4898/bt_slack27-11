public class BankAccount {
    private Long numberAccount;
    private String accountHolder;
    private Double balance;
    public  BankAccount(){}
    public BankAccount(Long numberAccount, String accountHolder, Double balance) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void withdraw(Double amount) {
        if (this.balance >= amount) {
            System.out.println("cho phép rút tiền");
        }else {
            System.out.println("giao dịch không hợp lệ ");
        }
    }
}
