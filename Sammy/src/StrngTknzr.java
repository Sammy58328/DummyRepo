import java.util.StringTokenizer;

public class StrngTknzr {

	public static void main(String[] args) {

        // Creating object of class inside main() method
        StringTokenizer st = new StringTokenizer("Hello Geeks How are you", " ");
        
        System.out.println(st.countTokens()); 
        // Condition holds true till there is single token
        // remaining using hasMoreTokens() method
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());


	}

}
