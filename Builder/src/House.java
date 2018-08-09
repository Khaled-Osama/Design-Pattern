
public class House {
	private String floorType;
	private String wallType;
	private String roofType;
	
	public String getFloorType() {
		return floorType;
	}
	public String getWallType() {
		return wallType;
	}
	public String getRoofType() {
		return roofType;
	}
	
	public void setFloorType(String mFloorType) {
		floorType = mFloorType;
	}
	public void setWallType(String mWallType) {
		wallType = mWallType;
	}
	public void setRoofType(String mRoofType) {
		roofType = mRoofType;
	}
	
	public void display() {
		System.out.println("this house is built from\n"+floorType+
				" Floor\n"+wallType+" Wall\n"+roofType+" Roof\n");
		
	}

}
