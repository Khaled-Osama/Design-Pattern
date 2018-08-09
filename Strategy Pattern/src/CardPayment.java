
public class CardPayment implements PaymentStrategy {
	private String cardType;
	private String issuer;
	private double amount;
	
	public CardPayment(String mCardType,String mIssuer,double mAmount) {
		this.cardType = mCardType;
		this.issuer = mIssuer;
		this.amount=mAmount;
	}
	

	@Override
	public void pay() {
		System.out.println(issuer + "  "+ cardType + "  "+amount +"$");
	}
	
}
