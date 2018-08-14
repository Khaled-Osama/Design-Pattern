
public class Main {

	public static void main(String[] args) {
		Order order =new Order();
		order.addItem(new Item("Pizza",9.99));
		order.addItem(new Item("cheese",5.5));
		order.addItem(new Item("Checken",15.99));
		order.addItem(new Item("Burger",7.5));
		
		System.out.println("\n\n_________________________________\n\n");
		
		order.makePayment(new Payment("CASH",20.00));
		order.makePayment(new Payment("CREDIT",10.00));
		order.makePayment(new Payment("DEBIT",10.00));
		
		System.out.println("\n\n___________________________________\n\n");
		order.completeOrder();
		
	}

}
