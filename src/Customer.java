public class Customer {

    private IPayment payment;

    // インスタンス化する際に依存性を注入する
    public Customer paymentType(IPayment payment) {
        this.payment = payment;
        return this;
    }

    // 委譲（delegation）を利用する
    public void pay() {
        this.payment.pay();
    }

}
