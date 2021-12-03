package activities;

public class Car {
	public String color;
	public String transmissions;
	public int make;
	public int tyres;
	public int doors;
	
	public Car()
	{
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics()
	{
		System.out.println("Color is "+color);
		System.out.println("Transmissions "+transmissions);
		System.out.println("Make "+make);
		System.out.println("Tyres "+tyres);
		System.out.println("Doors "+doors);
	}
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	public void brake()
	{
		System.out.println("Car has stopped.");	
	}
}
