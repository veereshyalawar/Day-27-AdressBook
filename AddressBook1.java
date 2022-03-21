package Day_27_AdressBook;

/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 * 
 * @author user -Veeresh
 *
 */
public class AddressBook1 {

	private class Contact {
		String firstName, lastNmae, address, city, state, emailId;
		int zipCode;
		long mobileNumber;
	}

	/**
	 * created method printContact for creating contacts in AddressBook
	 */
	public void printContact() {
		Contact person = new Contact();
		person.firstName = "Veeresh";
		person.lastNmae = "Yalawar";
		person.address = "Bagalkot";
		person.city = "Bagalkot";
		person.state = "Karnataka";
		person.zipCode = 587101;
		person.mobileNumber =8867743684L;
		person.emailId = "veereshyalawar2@gmail.com";
		System.out.println("===Contact Details of the person===");
		System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
				+ person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
				+ "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
				+ "EmailId       : " + person.emailId + "\n");
	}

	/**
	 * 
	 * Main method for manipulation Of Collections
	 * 
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * created instance of AddressBook class
		 */
		System.out.println("====Welcome to AdressBook====");
		AddressBook1 addressBook = new AddressBook1();
		/**
		 * Calling method printContact method to display contacts
		 */
		addressBook.printContact();

	}

}