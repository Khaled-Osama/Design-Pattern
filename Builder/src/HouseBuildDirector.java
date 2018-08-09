
public class HouseBuildDirector {
	
	private HouseBuilder houseBuilder;
	public HouseBuildDirector(HouseBuilder mHouseBuilder) {
		this.houseBuilder=mHouseBuilder;
	}
	
	public House construct() {
		return houseBuilder.buildFloor().buildRoof().buildWall().build();
	}

}
