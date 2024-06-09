package ClassPractice2;

public class BankAccount {


    private double balance;

    BankAccount (double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public void depositMoney (double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdrawMomey(double withdrawAmount) {
        balance = balance - withdrawAmount;
    }

}
