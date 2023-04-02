package Patterns;

public class Pattern2 {
	
	public static void main(String[] args) {

		int x=40, y=50;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("New value of x is - "+x);	
		System.out.println("New value of y is - "+y);	
		
	}
}
