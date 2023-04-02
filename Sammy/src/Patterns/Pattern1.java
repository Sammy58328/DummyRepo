package Patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int i=9, j,k;
		
		for (j=1;j<=i;j++)
		{
			if(j%2==1) 
				System.out.println(j);
			
			else 
				for (k=1;k<=j; k++) 
					System.out.print(j);									
				System.out.println();
							
		}				
	}
}
