package ClassPractice;

public class Account {

    private long accountNumber;
    private String name;
    private double balance;
    private String email;
    private String phone;

    Account (long accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }


    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(final double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid input (need positive number)");
        }
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void depositMoney(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdrawMoney(double withdrawAmont) {
        if (withdrawAmont < this.balance) {
            balance -= withdrawAmont;
        } else {
            System.out.println("SORRY!!! Withdraw amount is more than your balance");
        }
    }

}
