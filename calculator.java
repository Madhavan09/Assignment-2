	package week1.day2;

public class calculator {


public void additionTwoNumbers(int a,int b) {
	int C = a+b;
	System.out.println(C);
	
	}

	public void subractionTwoNumber(int d,int f) {
		int e = d- f;
		System.out.println(e);
	
	}
	public void multipleTwoNumbers(double i,double j) {
		double g =i*j ;
		System.out.println(g);
	}
	public void divideTwoNumbers(float m,float n) {
		float x = m/n;
		System.out.println(x);
	}
	public static void main(String[]args) {
		calculator Cals= new calculator();
		Cals.additionTwoNumbers(45, 45);
		Cals.subractionTwoNumber(30, 20);
		Cals.multipleTwoNumbers(35,57);
		Cals.divideTwoNumbers(256f, 6f);
	}
}