import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        Customer visaCustomer = new Customer().paymentType(new CreditCard());
        customers.add(visaCustomer);
        Customer oldCustomer = new Customer().paymentType(new Cash());
        customers.add(oldCustomer);

        // 支払方法による条件分岐が要らなくなり、
        // インタフェースと委譲（delegation）により、実装の切り替えも容易になる 
        for (Customer cus : customers) {
            cus.pay();
        }
    }
}
