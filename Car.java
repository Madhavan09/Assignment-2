package week1.day2;

public class Car {
	public void applybrake() {
		System.out.println("applybrake");
	}
public void applygear() {
	    System.out.println("applygear");
}
public void switchonac() {
	    System.out.println("switchonac");
}
public void applyacclerate() {
	System.out.println("applyacclerate");
}
public static void main(String[]args){
	Car actions=new Car();
	actions.applybrake();
	actions.applygear();
	actions.switchonac();
	actions.applyacclerate();
	
}
	
								

}
