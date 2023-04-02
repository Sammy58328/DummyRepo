package Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
		String s = "Welcome";
		char[] c = s.toCharArray();
		int i;
		
		for (i=0;i<s.length();i++) {
			System.out.print(c[i]);
			System.out.print(1);
		}
		System.out.print(2);

	}

}
