package ClassPractice;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(125879, "Iftakharul Alam");

//        account.accountNumber = 0707;
//        account.name = "Ifty";
//        account.email = "ifty@gmail.com";
//
//        account.balace = 500;
//
//        account.depositMoney(100);
//        System.out.println("Current Balance is : $"+ account.balace);
//
//        account.withdrawMoney(450);
//        System.out.println("Current Balance is : $"+ account.balace);

//        account.setName("Iftakharul Alam");
//
//        account.setAccountNumber(550707);
        System.out.println(account.getName()+ "'s Account number is " + (account.getAccountNumber()));

        account.setBalance(0);
        System.out.println("Current balance is : $"+ account.getBalance());

        account.depositMoney(500);
        System.out.println("Current balance is : $"+ account.getBalance());

        account.withdrawMoney(550);
        System.out.println("Current balance is : $"+ account.getBalance());



        /////////////////////////////////////////////////

        SavingsAccount_Practice saccount = new SavingsAccount_Practice(554477, "Ifty") ;

        saccount.setBalance(100);
        System.out.println("Current balance is $" + saccount.getBalance() );

        saccount.addInterest(1);
        System.out.println("After adding interest your current balance is $" +saccount.getBalance());

        saccount.addInterest(5);
        System.out.println(saccount.getBalance()) ;

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());

        saccount.savingsWithdraw(10);
        System.out.println(saccount.getBalance());
    }
}
