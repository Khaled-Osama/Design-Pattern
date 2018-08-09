
public class Main {

	public static void main(String[] args) {
		HouseBuilder builder = new WoodenHouseBuilder();
		HouseBuildDirector director= new HouseBuildDirector(builder);
		House house = director.construct();
		house.display();
		System.out.println("\t\t______________________\t");
		
		builder = new ConcreteHouseBuilder();
		director = new HouseBuildDirector(builder);
		house = director.construct();
		house.display();
		
	}

}
