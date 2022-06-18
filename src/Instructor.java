
public class Instructor extends registersOffice {
String fName,lName,phone,department;

public Instructor(String fName, String lName, String phone, String department) {
	this.fName = fName;
	this.lName = lName;
	this.phone = phone;
	this.department = department;
}

@Override
public String toString() {
	return "{\nInstructor ==> fName=" + fName + ", lName=" + lName + ", phone=" + phone + ", department=" + department ;
}


}
 