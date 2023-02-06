import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
	
	public static void main (String s[]) throws Exception
	{
		int n, rev=0, rem;
		System.out.println("Enter an Integer - ");
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		n=Integer.parseInt(reader.readLine());
		
		while (n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The reverse number is - "+rev);
	}

}
