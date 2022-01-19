package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatngSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

//default constructor is declared.
	public Computer() {
		System.out.println("This is from default constructor of Computer class");
	}

	// parameterized constructor is declared.
	public Computer(String brand, String model, String operatngSystem, int price, boolean madeInUSA, char grade) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatngSystem = operatngSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;

		System.out.println("My brand:" + brand + ", Model:" + model + ", Operating system:" + operatngSystem
				+ ", Price:" + price + "$" + ", Grade:" + grade + " and Made in USA?" + madeInUSA);
	}

}
