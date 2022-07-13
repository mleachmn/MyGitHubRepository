package person;

import address.Address;

public class Person {
	public String firstName;
	public String middleName;
	public String lastName;
	public String streetNumber;
	public String streetName;
	public String city;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String state;
	public String zip;
	public String phoneNumber;

	public Person(String firstName, String lastName, String middleName, String streetNumber, String streetName,
			String city, String state, String zip, String phoneNumber) {

		this.setPhoneNumber(phoneNumber);
		this.setFirstName(firstName);
		this.setLastname(lastName);
		this.setMiddleName(middleName);
		this.setStreetNumber(streetNumber);
		this.setStreetName(streetNumber);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		
		// this.setAddress(address);
	}

	private void setAddress(Address address2) {
		// TODO Auto-generated method stub

	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", streetNumber=" + streetNumber + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}



}
