package Patterns;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		System.out.println("Enter two numbers:");
		try(Scanner scan = new Scanner(System.in)){
		int i = scan.nextInt();
		int j = scan.nextInt();
		System.out.println("Two numbers before swapping :"+i+ " and " +j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("The two values after swapping:"+i+ " and "+j);
		}
	}

}
