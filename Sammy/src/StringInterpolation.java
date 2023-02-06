
public class StringInterpolation {

	public static void main(String[] args) {
		
		// String 1
        String name = "Geeks for Geeks";
 
        // String 2
        String field = "Data Structures";
 
        // Print and display the interpolated string
        System.out.println(String.format(
            "%s is the best platform to learn %s .", name,  field));

	}

}
