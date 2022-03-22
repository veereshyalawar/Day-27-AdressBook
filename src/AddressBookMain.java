
/**
 * importing scanner class to take input from console
 */
import java.util.Scanner;

public class AddressBookMain {

	/**
	 * Main method for manipulation AddressBookCollection
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		/**
		 * from addressBook class calling add contact method to edit and delete the
		 * contacts
		 */
		addressBook.addContact();
		System.out.println("Enter 0 To Edit The Contact and 1 To Delete The Contact ");
		int choice = scanner.nextInt();
		if (choice == 0) {
			addressBook.editContact();
		} else {
			addressBook.deleteContact();
		}

	}

}