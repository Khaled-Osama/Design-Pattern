import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String vehicleType = scanner.nextLine().toLowerCase();
		
		VehicleFactory factory = new VehicleFactory();
		
		Vehicle vehicle= factory.getVehicle(vehicleType);
		vehicle.design();
		vehicle.manufacture();

	}

}
