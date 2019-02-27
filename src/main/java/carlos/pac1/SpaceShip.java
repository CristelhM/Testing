package pac1;

public interface SpaceShip {

	public boolean launch();
	public boolean land();
	public boolean canCarry(Item i);
	public int carry(Item i);
	
}
