package assignement4;
/*Assignment 4
==============

Class: Students
Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/
public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID is "+id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is "+id+" and Student name is "+name);
		
	}
	public void getStudentInfo(String emailid, Long phonenumber) {
		System.out.println("Student E-Mail id is "+emailid+" and Student Mobile Number is "+phonenumber);
	}
	public static void main(String[] args) {
		Students s1=new Students();
		s1.getStudentInfo(134267);
		s1.getStudentInfo(14567, "Anusha");
		s1.getStudentInfo("anusha2@gmail.com", 9999999999L);

	}

}
