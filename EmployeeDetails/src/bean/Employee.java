package bean;


public class Employee implements Comparable<Employee> {

	private String firstName;
	private String lastName;
	private long mobileNo;
	private String email;
	private String address;
	
	
	public Employee( String firstName, String lastName, long mobileNo, String email, String address ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
	}
	
	public Employee() {
		super();
	}
	
//	get/set for first name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
//	get/set for last name
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	get/set for mobile number
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
//	get/set for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
//	get/set for email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	display employee detail
	@Override
	public String toString() {
		return "FirstName: " + firstName + ", LastName: " + lastName + ", MobileNumber: " + mobileNo
				+ ", emailId=" + email + ", address=" + address;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(e.getFirstName());
	}
	
}
