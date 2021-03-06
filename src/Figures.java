/*
 * Christopher Chakchay
 * Programming fundamentals
 * Summer 2021
 * Programming Assignment 2 - Figures
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Figures {

	static int size = 0;

	public static void main(String[] args) {

		int figure;
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Christopher Chakchay");
		System.out.println("PROGRAMMING ASSIGNMENT 2 \n");

		System.out.print("Enter the size of the figure (odd number): "); // Prompts user for input

		Scanner scan = new Scanner(System.in);

		try {

			Figures.size = scan.nextInt();

			// if user input is not an odd number
			while (Figures.size % 2 == 0) {
				System.out.println("Invalid figure size - must be an odd number ");
				System.out.println("");
				System.out.print("Renter the size of the figure: ");
				Figures.size = scan.nextInt();
			}

			// Prints out a menu to choose from
			System.out.println(" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
			System.out.print("Please select an option : ");

			// Scans next user input to choose a menu option
			figure = scan.nextInt();
			System.out.println("");

			// Pull correct method into main once they choose an option from menu, then
			// reprints menu
			while (true) {
				if (figure == 1) {
					Figures.printBox();

					System.out.println(
							" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
					System.out.print("Please select an option : ");
				}
				if (figure == 2) {
					Figures.printDiamond();

					System.out.println(
							" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
					System.out.print("Please select an option : ");
				}
				if (figure == 3) {
					Figures.printX();

					System.out.println(
							" \n Menu: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program \n");
					System.out.print("Please select an option : ");
				}
				if (figure == 4) {
					scan.close();
					System.out.print("Good bye!");
					System.exit(0);
				}
				if (figure > 4 || figure < 1) {
					System.out.print("Please select a number from the given menu: ");
				}
				figure = scan.nextInt();
				System.out.println("");

			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, please try again and enter a number");
		} catch (Exception e) {
			System.out.println("Invalid input");
		}

	}

	public static void printBox() {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("X");
			}
			System.out.println(); // Prints new line after every row reaches users size input.
		}
	}

	public static void printDiamond() {

		int i;
		int j;
		int middle;
		middle = ((size + 1) / 2); // Establishes a middle by dividing size by 2
		// System.out.println(middle);

		// first half
		for (i = 1; i <= middle; i++) { // For loop that keeps printing until i is <= middle
			for (j = 1; j <= (middle - i); j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("XX");
			} else {
				System.out.print("X"); // Prints top left segment

				for (j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print(" X"); // Prints top right segment
			}
			System.out.println(); // Prints new line after every row
		}

		// Second half
		for (i = middle + 1; i < size + 1; i++) {
			for (j = 1; j <= i - middle; j++) {
				System.out.print(" ");
			}
			if (i == (size + 1) - 1) {
				System.out.print("XX");
			} else {
				System.out.print("X"); // Prints bottom left segment

				for (j = 1; j <= 2 * ((size + 1) - i) - 3; j++) {
					System.out.print(" ");
				}
				System.out.print(" X"); // Prints bottom right segment
			}
			System.out.println(); // Prints new line after every row
		}

	}

	public static void printX() {

		for (int i = 0; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == i) {
					System.out.print("X");
				} else if (j == size - (i - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
