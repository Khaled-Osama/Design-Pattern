
public class CashPayment implements PaymentStrategy{

	double amount;
	
	public CashPayment(double mAmount) {
		this.amount = mAmount;
	}
	@Override
	public void pay() {
		System.out.println("Cash  "+amount + "$");
		
	}

}
