
public class WoodenHouseBuilder implements HouseBuilder {
	
	House house;
	public WoodenHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildWall() {	
		house.setWallType("Wooden");
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType("Wooden");
		return this;
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType("Wooden");
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}
