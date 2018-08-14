
public class CustomerDisplay implements Observer {

	@Override
	public void update(String line) {
		System.out.println("[Customer Display] "+line);
	}
}
