package Session10.Btth_ss10;

public class Main {
    public static void main(String[] args) {

        CreditCard card = new CreditCard(
                "Dang Van Thang",
                "CC01",
                "1234567812345678",
                "123",
                10000000
        );

        card.validate();
        card.pay(2000000);

        System.out.println();

        EWallet wallet = new EWallet(
                "Dang Van Thang",
                "EW01",
                "0987654321",
                5000000
        );

        wallet.validate();
        wallet.pay(1000000);

        System.out.println();

        Payable reward = new Payable() {
            @Override
            public void pay(double amount) {
                double points = amount / 1000;
                System.out.println("Thanh toan bang diem thuong. Diem su dung: " + points);
            }
        };

        reward.pay(300000);
    }
}
