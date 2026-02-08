package Session10.Btth_ss10;

public class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {

        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    void validate() {
        if (!cardNumber.matches("\\d{16}")) {
            System.out.println("So the khong hop le");
        } else {
            System.out.println("The hop le");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Thanh toan bang the thanh cong");
            System.out.println("Han muc con lai: " + creditLimit);
        } else {
            System.out.println("Vuot qua han muc tin dung");
        }
    }
}

