
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order= new Order();
		order.addItem(new Item("Margherita",50.0));
		order.addItem(new Item("Four Cheese",75.0));
		order.addItem(new Item("BBQ Chicken",80.0));
		
		order.displayItems();
		System.out.println("__________________");
		
		order.addPayment(new CashPayment(100));
		order.addPayment(new CardPayment("Credit","Visa",55.0));
		order.addPayment(new CardPayment("Debit","AMEX",50.0));
		
		order.displayPayments();
		
	}

}
