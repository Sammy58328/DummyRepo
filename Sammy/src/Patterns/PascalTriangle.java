package Patterns;
import java.util.Scanner;

public class PascalTriangle {
	
	public static void main(String...s )
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
		}
		
	}

}
