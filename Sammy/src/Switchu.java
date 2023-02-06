import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switchu {
	
	public static void main (String s[]) throws Exception
	{
		int n;
		System.out.println("Enter an Integer - ");
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		n=Integer.parseInt(reader.readLine());
		
		switch(n)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("None of the above");
						
		}

	}
}
