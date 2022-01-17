package hw3Q2JavaVariables;

public class AboutMe {
	public String myPersonalInfo; // here string is declared as a reference variable.
	public String name = "Asma Akter";// initialize the string as a reference variable.
	public long phoneNo = 13476410023l; // variable is initialized.
	public int zip = 11419;
	public float height = 5.1f;
	public double weight = 130.5;
	public char gender = 'f';
	public String Address = "  505 Queens ave\n\t\tQueens,NY";
	public byte age = 22; // variable is initialized
	public short timeLivedinUsa = 2; // variable is initialized.
	public boolean allData = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();

		System.out.println("Name:" + aboutMe.name + "\nAge(Years):" + aboutMe.age + "\nGender:" + aboutMe.gender);
		System.out.println("Height(ft):" + aboutMe.height + "\nWeight(Ibs):" + aboutMe.weight + "\nAddress: "
				+ aboutMe.Address + "\nZip Code:\t" + aboutMe.zip + "\nPhone No:" + aboutMe.phoneNo + "\nAllData:"
				+ aboutMe.allData);
	}
}

