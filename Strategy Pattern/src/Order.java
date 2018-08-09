import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Item> cart;
	private List<PaymentStrategy>payments;
	
	public Order() {
		cart= new ArrayList<Item>();
		payments = new ArrayList<PaymentStrategy>();
	}
	
	public void addItem(Item item) {
		cart.add(item);
	}
	public void displayItems() {
		for(Item item:cart) {
			System.out.println(item.getName()+"\t"+item.getPrice());
		}
	}
	public void addPayment(PaymentStrategy payment) {
		payments.add(payment);
	}
	public void displayPayments() {
		for(PaymentStrategy payment:payments) {
			payment.pay();
		}
	}

}
