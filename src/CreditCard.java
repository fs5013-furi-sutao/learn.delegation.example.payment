public class CreditCard implements IPayment {
    @Override
    public void pay() {
        System.out.println("They paid with credit cards.");
    }
}
