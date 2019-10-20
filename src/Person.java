
public class Person {
	String firstName;
	String lastName;
	int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isTeen() {
		if ((this.age > 12) && (this.age < 20)) {
			return true;
		} else {
			return false;
		}
	}

	public String getFullName() {
	 String fullName=this.firstName +" "+ this.lastName;
	 return fullName;
 }
}