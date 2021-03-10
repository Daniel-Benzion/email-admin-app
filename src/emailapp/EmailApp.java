package emailapp;

import java.util.Scanner;

public class EmailApp {

	private Scanner scanner;

	public EmailApp() {
		scanner = new Scanner(System.in);
	}

	public void start() {

		while (true) {

			System.out.println("Welcome to the Email Administration Application!");
			System.out.println("What would you like to do?");
			System.out.println("1: View all users.");
			System.out.println("2: Add a user.");
			System.out.println("3: Change user department.");
			System.out.println("4: Change user password.");
			System.out.println("5: Exit application.");
			String input = scanner.nextLine();

			if (input.equals("1")) {
				//viewUsers();
			} else if (input.equals("2")) {
				//addUser();
			} else if (input.equals("3")) {
				//changeDept();
			} else if (input.equals("4")) {
				//changePassword();
			} else if (input.equals("5")) {
				System.out.println("Bye");
				break;
			} else {
				System.out.println("That is not a valid selection. Please try again.");
				System.out.println("Press enter to continue.");
				scanner.nextLine();
			}

		}


	}
}
