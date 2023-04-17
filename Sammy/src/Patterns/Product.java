package Patterns;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = i*j;

		System.out.println("The product is : "+k);
		scan.close();
	}

}
