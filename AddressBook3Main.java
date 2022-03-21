package Day_27_AdressBook;

/** 
 * @author veeresh
 * importing scanner class to take input from console
 *
 */
import java.util.Scanner;

public class AddressBook3Main {

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("*Welcome to adressbook");
		AddressBook3 addressBook = new AddressBook3();
		Scanner scanner = new Scanner(System.in);
		/**
		 * from addressBook class calling add contact method to edit the contacts
		 */
		addressBook.addContact();
		System.out.println("*****Enter E To Edit The Contact****");
		String choice = scanner.nextLine();
		if (choice.equals("E") || choice.equals("E")) {
			addressBook.editContact();
		}
		else 
		{
			System.out.println("Thank you");
		}
			scanner.close();
		

	}

}