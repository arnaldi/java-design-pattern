package LinkovSubstitutionPrinciple.Old;

public class CommonBankAccount {
    protected double balance;

    public CommonBankAccount() {
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void cashOut(double value) {
        if(value <= this.balance) {
            this.balance -= value;
        }else{
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void income()      {
        this.balance*= 0.02;
    }
}
