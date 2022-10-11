package week1.day2;

public class Employedetails {
public void employeName()	
{
	String EmployeName="Madhavan";
	int EmployeID=89;
	System.out.println("Employe Name="+EmployeName);
	System.out.println("Employe ID="+EmployeID);
}
public void employeAddress() {
String EmployeAddress="Maduravoyal";
System.out.println("Employe Address="+EmployeAddress);
}
public void EmployeSalary() {
	Double Employe=900.999;
	System.out.println("Employe Salary=Rs "+Employe+"/-");
}
public void EmployeMobileNumber() {
	Long MobileNumber=7092173326L;
	System.out.println("Employe Mobile Number="+MobileNumber);
}
public static void main(String[]args) {
	Employedetails details=new Employedetails();
	details.employeName();
	details.employeAddress();
	details.EmployeSalary();
	details.EmployeMobileNumber();
}
}
	
	
	
	
	
	
	

	



