package Classes;

// The problem is in this link: (https://www.w3resource.com/java-exercises/index-inheritance.php) Q. 5

public class BankAccount {

    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void WithdrawMoney(double withdrawMoney) {
        balance = balance - withdrawMoney;
    }

    public void DepositMomney(double depositMoney) {
        balance = balance + depositMoney;
    }
}

