package ClassPractice2;

public class SavingsAccount2 extends BankAccount{


    SavingsAccount2(double balance) {
        super(balance);
    }

    public void withdrawMoneey(double withdrawAmount) {
        if ((getBalance() - withdrawAmount) <= 100) {
            System.out.println("Sorry!! can not withdraw. Account balance is less than $100");
        } else {
            setBalance(getBalance() - withdrawAmount);
        }
    }
}
