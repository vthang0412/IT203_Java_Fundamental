package Session10.Btth_ss10;

class EWallet extends PaymentMethod implements Payable {
    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    void validate() {
        if (!phoneNumber.matches("\\d{10}")) {
            System.out.println("So dien thoai khong hop le");
        } else {
            System.out.println("Vi hop le");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Thanh toan bang vi thanh cong. So du con lai: " + balance);
        } else {
            System.out.println("So du khong du");
        }
    }
}
