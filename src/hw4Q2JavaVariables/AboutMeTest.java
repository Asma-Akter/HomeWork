package hw4Q2JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {

		// Object aboutMe is instantiated .
		// Constructor is also initialized .
		AboutMe aboutMe = new AboutMe();

		// variables are initialized here.
		aboutMe.name = "Asma Akter";
		aboutMe.Address = "505 Queens ave\nQueens,NY";
		aboutMe.age = 22;
		aboutMe.timeLivedinUsa = 2;
		aboutMe.phoneNo = 17183904563l;
		aboutMe.zip = 11419;
		aboutMe.height = 5.1f;
		aboutMe.weight = 130.5;
		aboutMe.gender = 'f';
		aboutMe.allData = true;
		aboutMe.aboutMe();

		System.out.println("\n*****************************\n");
		AboutMe aboutAlex = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.

		// The variables are initialized here.
		aboutAlex.name = "Alex";
		aboutAlex.Address = "1454 43rd ave";
		aboutAlex.age = 24;
		aboutAlex.timeLivedinUsa = 12;
		aboutAlex.phoneNo = 16466457865l;
		aboutAlex.zip = 11420;
		aboutAlex.height = 5.5f;
		aboutAlex.weight = 120.5;
		aboutAlex.gender = 'M';
		aboutAlex.allData = true;
		aboutAlex.aboutMe();

	}
}
