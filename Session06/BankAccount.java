package Session06;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "000000";
        this.ownerName = "Chua xac dinh";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayInfo() {
        System.out.println("So tai khoan: " + accountNumber);
        System.out.println("Chu tai khoan: " + ownerName);
        System.out.println("So du: " + balance);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("111001", "Nguyen Van A", 5000);
        BankAccount acc2 = new BankAccount("111002", "Tran Thi B", 3000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayInfo();

        acc2.withdraw(500);
        acc2.deposit(1500);
        acc2.displayInfo();
    }
}
