
public abstract class Factory {
	private static Factory carFactory=null;
	private static Factory truckFactory=null;
	
	public abstract Engine getEngine();
	public abstract Tyre getTyre();
	
	public static Factory getFactory(String vehicleType) {
		if(vehicleType == null) { return null;}
		Factory retFactory = null;
		switch(vehicleType) {
		case "car":
			if(carFactory == null)carFactory = new CarFactory();
			retFactory = carFactory;
			break;
		case "truck":
			if(truckFactory == null)truckFactory = new TruckFactory();
			retFactory = truckFactory;
			break;
	
		}
		return retFactory;
	}
}
