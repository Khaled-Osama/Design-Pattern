
public interface Topic {
	public void register(Observer observer);
	public void notifyObservers(String line);

}
