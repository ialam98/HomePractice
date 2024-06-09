package ClassPractice;

public class SavingsAccount_Practice extends Account {
    SavingsAccount_Practice(long accountNumber, String name) {
        super(accountNumber, name);
    }

    //Write a method where we can add interest

    public void addInterest(double addInterestAmount) {
        double savingBalance = getBalance() + addInterestAmount;
        setBalance(savingBalance);
    }

    //Write a method we can not withdraw more than 5 times.
    int withdrawlimit = 5;
    int count = 0;

    public void savingsWithdraw(double savingsWithdrawAmount) {
        if(savingsWithdrawAmount < getBalance() && count < withdrawlimit) {
            setBalance(getBalance() - savingsWithdrawAmount);
            count++;
        } else {
            System.out.println("SORRY!! You can not withdraw. Your withdraw amount exceed your balance limit");
        }
    }

}


