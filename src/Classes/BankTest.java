package Classes;

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(550);
        System.out.println(bankAccount.getBalance());

        SavingsAccount saccount = new SavingsAccount(600);
        saccount.WithdrawMoney(499);
        System.out.println(saccount.getBalance());


        BankAccount bankaccount1 = new SavingsAccount(600);
        bankaccount1.WithdrawMoney(550);
        System.out.println(bankaccount1.getBalance());
    }
}
