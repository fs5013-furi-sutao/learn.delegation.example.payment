public class Cash implements IPayment {
    @Override
    public void pay() {
        System.out.println("They paid with cash bills.");
    }
}
