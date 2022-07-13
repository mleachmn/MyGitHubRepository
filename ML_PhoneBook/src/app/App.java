package app;

import java.nio.channels.IllegalSelectorException;
import java.util.*;
import personList.*;

public class App {

	public static void main(String args[]) {

		menuselection();
		System.out.println(" COMPLETE.");
	}

	public static void menuselection() {
		// TODO Auto-generated method stub
		Date myDate = new Date();
		try {
			int userselection = 0;

			while (userselection != 5) {

				System.out.println("\"*********Phone Book Menu***********\"");
				System.out.println("******" + myDate + "*****");
				System.out.println("");
				System.out.println("1: Add a new member.");
				System.out.println("2: Delete a member.");
				System.out.println("3: Search for a record.");
				System.out.println("4: List all members.");
				System.out.println("5: QUIT.");

				Scanner scanner = new Scanner(System.in);

				System.out.println("Please enter your selection: ");
				userselection = scanner.nextInt();
				// ___________________________________________________________

				switch (userselection) {

				case 1:
					PersonList.addPerson();
					break;
				case 2:
					PersonList.deleteMember();
					break;
				case 3:
					PersonList.getOneSearchPerson();
					;
					break;
				case 4:
					PersonList.getAllPeople();
					break;
				case 5:
					System.out.println("Thank you for reviewing my phone book program. " + "Have a fine Java day! ");
					break;
				default:
					System.out.println("Hi Branden O. Your selection is invalid."
							+ "Please enter a new selection or press 5 to quit.");
					break;
				}
			}
		} catch (IllegalSelectorException e) {
			System.out.println("Invalid input.");
		}
	}
}
