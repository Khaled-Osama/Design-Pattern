import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {
	
	List<Observer> observers;
	public AddPaymentTopic() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers(String line) {
		for(Observer observer : observers) {
			observer.update(line);
		}
	}
}
