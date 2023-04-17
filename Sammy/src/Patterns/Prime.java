package Patterns;

public class Prime {

	public static void main(String[] args) {
		
		int i = 14, flag=0;
		
		for (int j=2; j<i; j++) {
			if (i%j==0) {
				System.out.println("This is not a prime num");
				flag=1;  
				break;
			}
		}
		if (flag==0)
			System.out.println("This is a prime num");
	}

}
