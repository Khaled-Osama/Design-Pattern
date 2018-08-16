import java.util.Scanner;

public class Main {
	static Scanner scanner;
	public static void main(String[] args) {
		 scanner= new Scanner(System.in);
		String vehicleType = scanner.nextLine();
		vehicleType = vehicleType.toLowerCase();
		
		try {
		Factory factory = Factory.getFactory(vehicleType);
		Engine engine = factory.getEngine();
		engine.design();
		engine.manufacture();
		engine.test();
		Tyre tyre = factory.getTyre();
		tyre.design();
		tyre.manufacture();
		}
		catch(Exception e) {
			System.out.println("Please Select correct Fatory"); main(args);
		}
	}

}
