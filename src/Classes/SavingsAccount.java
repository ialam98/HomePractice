package Classes;

public class SavingsAccount extends BankAccount{

    SavingsAccount(double balance) {
        super(balance);
    }

    public void WithdrawMoney(double withdrawAmount){
        double sBalance = getBalance();
        if((sBalance - withdrawAmount) >100 ){
            sBalance = sBalance - withdrawAmount;
            setBalance(sBalance);
        } else {
            System.out.println("You can not withdraw" + withdrawAmount+ " amount");
        }
    }

}
