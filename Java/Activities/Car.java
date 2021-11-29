package fst_b17;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors;

	public Car(){
		//tyres = 4;
		doors = 4;
	}
	
	void displayCharacteristics(){
		System.out.println("Color = " + color);
		System.out.println("Transmission = " + transmission);
		System.out.println("Make = " + make);
		System.out.println("No. of tyres = " + tyres);
		System.out.println("No. of doors = " + doors);
	}
	
	void accelerate(){
		System.out.println("Car is moving forward");
	}
	
	void brake(){
		System.out.println("Car has stopped");
	}
}
