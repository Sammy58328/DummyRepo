import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String s=scan.next();

		char c[]=s.toCharArray();
		for(int i=(c.length-1);i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
