
public class ConcreteHouseBuilder implements HouseBuilder {
	House house;
	public ConcreteHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildWall() {	
		house.setWallType("Concrete");
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType("Concrete");
		return this;
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType("Concrete");
		return this;
	}

	@Override
	public House build() {
		return house;
	}
}
