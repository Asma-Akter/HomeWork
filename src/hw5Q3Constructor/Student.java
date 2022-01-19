package hw5Q3Constructor;

public class Student {
	// variables are declared.
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// default constructor is declared.
	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID:" + stID + ", Sex:" + sex + ", Grade:" + grade
				+ " and Java Programmer? " + " Ans:" + isProgrammer);
	}

}
