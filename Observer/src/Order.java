import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Item> cart;
	private List<Payment>payments;
	
	private Topic addItemTopic;
	private Topic addPaymentTopic;
	private Topic completeOrderTopic;
	
	public Order() {
		cart = new ArrayList<Item>();
		payments = new ArrayList<Payment>();
		
		Observer cashierObserver = new CashierDisplay();
		Observer customerObserver = new CustomerDisplay();
		
		addItemTopic = new AddItemTopic();
		addPaymentTopic = new AddPaymentTopic();
		completeOrderTopic = new CompleteOrderTopic();
		
		addItemTopic.register(cashierObserver);
		addPaymentTopic.register(cashierObserver);
		completeOrderTopic.register(cashierObserver);
		
		addItemTopic.register(customerObserver);
		addPaymentTopic.register(customerObserver);
		completeOrderTopic.register(customerObserver);
	}
	
	public void addItem(Item item) {
		cart.add(item);
		String line = item.name + "  "+item.price+" $";
		addItemTopic.notifyObservers(line);
	}
	
	public void makePayment(Payment payment) {
		payments.add(payment);
		String line = payment.type + "  "+payment.amount+" $";
		addPaymentTopic.notifyObservers(line);
	}
	public void completeOrder() {
		String line = "Order Completed";
		completeOrderTopic.notifyObservers(line);
		
	}
	
	

}
