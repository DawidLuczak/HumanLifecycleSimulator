package dawid.luczak.model;

public enum LocationEnum {
	
	SEA("Sea", 0, 0),
	BEACH("Beach", 10,10),
	WILD_ROAD("Wild road", 10, 20),
	FOREST("Forest", 20, 30),
	MEADOW("Meadow", 50, 50),
	TOWN("Town", 100, 100),
	CITY("City", 200, 200);
	
	
	private final String name;
	private final int x, y;
	
	LocationEnum(String name, int x, int y){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}
	
	public int distance(LocationEnum location){
		return (int) Math.sqrt(Math.pow(x - location.getX(), 2) + Math.pow(y - location.getY(), 2));
	}
	
	@Override
	public String toString() {
		return name + "[" + x + ", " + y + "]";
	}
}
