package personList;

import person.Person;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonList {
	static Person[] theTestCase = {
			new Person("John", " ", "Doe", "114", "Market St", "ST Louis", "MO", "63403", "6366435698"),
			new Person("John", "E", "Doe", "324", "Main", "St Charles", "MO", "63303", "8475390126"),
			new Person("John", "Michael West", "Doe", "574", "Pole ave", "St Peters", "MO", "63333", "5628592375") };
	static Person[] myTempArray = new Person[theTestCase.length + 1];

	public PersonList() {

	}

	// ADDS A NEW MEMBER - Menu selection 1 method
	public static void addPerson() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a new contact and use a ',' (comma) between each string.");
		System.out.println("Example: John, Wesley, Jones, 4540, Terry, Memphis, TN, 38125, 901554-2266");
		String keyboardinput = input.nextLine();
		String[] splitUpInput = keyboardinput.split(",");
		Person newContact = new Person(splitUpInput[0], splitUpInput[1], splitUpInput[2], splitUpInput[3],
				splitUpInput[4], splitUpInput[5], splitUpInput[6], splitUpInput[7], splitUpInput[8]);
		for (int i = 0; i < theTestCase.length; i++) {
			myTempArray[i] = theTestCase[i];
		}
		myTempArray[myTempArray.length - 1] = newContact;
		theTestCase = myTempArray;

		System.out.println("Would you like at add another member? 1 = yes, 2 = no.");
		int keyquit = input.nextInt();
		if (keyquit == 1) {
			System.out.println("Next Member");
		} else if (keyquit == 2) {
			return;
		} else {
			System.out.println("Invalid input");
		}

	}

	// SEARCH FOR A MEMBER - Menu selection 3 method.
	public static void getOneSearchPerson() {
		Scanner in = new Scanner(System.in);
		System.out.println("please provide a member name you would like to search for.");
		String search = in.nextLine();
		String errorMessage = "No member or string found.";
		boolean error = false;
		for (int i = 0; i < theTestCase.length; i++) {
			if (theTestCase[i].lastName.equals(search)) {
				System.out.println(theTestCase[i]);
			} else if (!theTestCase[i].lastName.equals(search)) {
				error = true;
			}
		}
		if (error == true) {
			System.out.println(errorMessage);
		}
		System.out.println("Would you like at search for another member? 1 = yes, 2 = no.");
		int keyquit = in.nextInt();
		if (keyquit == 1) {
			System.out.println("Next Member");
		} else if (keyquit == 2) {
			return;
			//app.App.menuselection();
		} else {
			System.out.println("Invalid input");
		}
	}

	// DELETES A MEMBER - Menu selection 2 method
	public static void deleteMember() {
		Scanner in = new Scanner(System.in);
		System.out.println("please provide a name of the member you would like to delete.");
		String search = in.nextLine();
		int size = theTestCase.length;
		for (int i = 0; i < theTestCase.length; i++) {
			if (theTestCase[i].lastName.equals(search)) {
				theTestCase[i] = null;

				System.out.println(Arrays.toString(theTestCase));
				size--;
			}
		}
		Person[] myTempArray = new Person[size];
		for (int i = 0; i < myTempArray.length; i++) {
			if (theTestCase[i] != null) {
				myTempArray[i] = theTestCase[i];
			} else {
				myTempArray[i] = theTestCase[i + 1];
			}
		}
		theTestCase = myTempArray;
		System.out.println(Arrays.toString(theTestCase));

		System.out.println("Would you like at delete another member? 1 = yes, 2 = no.");
		int keyquit = in.nextInt();
		if (keyquit == 1) {
			System.out.println("Next Member");
		} else if (keyquit == 2) {
			return;
		//	app.App.menuselection();
		} else {
			System.out.println("Invalid input");
		}
	}


	// DISPLAYS ALL MEMBERS - Menu selection 4 method.
	public static void getAllPeople() {
		System.out.println(Arrays.toString(theTestCase));
	     return;
		}

	
	// List the members via String constructor in Persons.
	public String toString() {
		return Arrays.toString(theTestCase);
	}
	
	
	}


