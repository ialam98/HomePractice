package ClassPractice2;

public class AccountTest2 {
    public static void main(String[] args) {

        SavingsAccount2 savingsAccount = new SavingsAccount2(0);

        savingsAccount.depositMoney(300);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdrawMoneey(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdrawMoneey(150);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdrawMoneey(50);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdrawMoneey(60);
        System.out.println(savingsAccount.getBalance());

    }
}
