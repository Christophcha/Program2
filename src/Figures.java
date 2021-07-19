import java.util.Scanner;

public class Figures {

	static int size = 0;
	
	public static void main(String[] args) {
		
		int figure;
		
		System.out.print("Enter the size of the figure (odd number): ");
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Figures.size = scan.nextInt();
		
		//if user input is not an odd number
		while(Figures.size % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number ");
			System.out.println("");
			System.out.print("Renter the size of the figure: ");
			Figures.size = scan.nextInt();
		}
		
		System.out.println(" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
		System.out.print("Please select an option : " );
		
		figure = scan1.nextInt();
		System.out.println("");
		
		while (figure > 0 && figure < 4) {
			if (figure == 1) {
				Figures.printBox();
				
				System.out.println(" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
				System.out.print("Please select an option : ");
			}
			if (figure == 2) {
				Figures.printDiamond();
				
				System.out.println(" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
				System.out.print("Please select an option : ");
			}
			if (figure == 3) {
				Figures.printX();
				
				System.out.println(" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
				System.out.print("Please select an option : ");
			}
			if (figure == 4) {
				System.out.print("Good bye!");//not working??
				System.exit(0);
			}
			figure = scan1.nextInt();
			System.out.println("");
			
			
			//while (figure < 1 || figure > 4) {
				//System.out.print("Please select a number from the given menu: ");
				//System.out.println("");
				//figure = scan1.nextInt();
			}
		}
	
	
	public static void printBox() {
		
		//uses nested for loops to print a row of 5 stars, 5 times.
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print("X");
			}
		System.out.println(); //adds a new line every time 5 stars are printed.
		}
	}
		
	public static void printDiamond() {
		
	}
	public static void printX() {
	
}
}
