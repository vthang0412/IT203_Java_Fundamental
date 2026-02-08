package Session10.Btth_ss10;

abstract class PaymentMethod {
    protected String accountName;
    protected String paymentId;

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    abstract void validate();
}
