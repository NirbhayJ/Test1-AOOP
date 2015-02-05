

public class Car {
	private String Make;
	private String Model;
	private String Color;
	private String Year;
	
	public Car(String make, String model, String color, String year) 
	{
		this.Make = make;
		this.Model = model;
		this.Color = color;
		this.Year = year;
		show();
	}
	public void drive() 
	{
		System.out.println("i am Driving car.");
	}

	public void show()
	{
		System.out.println("Car Information");
		System.out.println("Make:" + Make);
		System.out.println("Model:" + Model);
		System.out.println("Color:" + Color);
		System.out.println("Year:" + Year);
	}
	

}
