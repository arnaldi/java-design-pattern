package LinkovSubstitutionPrinciple;

public class AccountManager {

    private double balance;

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

    public void income(double tax){
        this.balance = this.balance + (this.balance*tax);
    }
}
