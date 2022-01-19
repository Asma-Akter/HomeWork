package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer infoComputer = new Computer(); // default constructor is initialized.

		Computer infoComputerA = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');
		Computer infoComputerB = new Computer("HP", "MacBook Air", "Windows 10", 599, false, 'A');
	}

}
