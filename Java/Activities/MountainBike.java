package activities;

public class MountainBike extends Bicycle {

	public int height;
	public MountainBike(int gears, int speed, int Sheight) {
		super(gears, speed);
		height=Sheight;
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int newValue) {
        height = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + height);
    } 
}
