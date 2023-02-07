import java.util.StringTokenizer;

public class StrngTknzr {

	public static void main(String[] args) {

        // Creating object of class inside main() method
        StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
 
        // Condition holds true till there is single token
        // remaining using hasMoreTokens() method
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());

	}

}
