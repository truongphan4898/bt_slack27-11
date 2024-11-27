public class SavingAccount extends BankAccount {
    private Double interestRate;
    public SavingAccount() {}
    public SavingAccount(Long numberAccount, String accountHolder, Double balance,Double interestRate) {
        super(numberAccount, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        if(amount > 0){
            this.setBalance(this.getBalance() + amount);
            System.out.println("Giao dịch thành công");
            System.out.println("tài khoản: "+this.getAccountHolder()+" đã được cộng thêm: "+amount);
            System.out.println("số dư tài khoản: "+this.getBalance());
        }else {
            System.out.println("giao dịch không thành công");
        }
    }
}
