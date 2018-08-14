
public class CashierDisplay implements Observer {

	@Override
	public void update(String line) {
		System.out.print("[cashierDisplay] "+line+"\t");
	}

	
}
