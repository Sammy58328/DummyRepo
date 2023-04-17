package Patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int i=9, j,k;
		
		for (j=1;j<=i;j++)
		{
			System.out.println();
			if(j%2==1) 
				System.out.print(j);
			
			else 
				for (k=1;k<=j; k++) 
					System.out.print(j);									
							
		}				
	}
}

/*
 * 1 
 * 22 
 * 3 
 * 4444 
 * 5 
 * 666666 
 * 7 
 * 88888888 
 * 9
 */