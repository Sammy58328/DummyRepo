		import java.util.*;
		
public class PropertyDemo {

	public static void main(String[] args) {
	
		      Properties prop = new Properties();

		      // add some properties
		      prop.put("Height", "200");
		      prop.put("Width", "150");
		      prop.put("Scannable", "true");

		      //This method returns the value in this property list with the specified key value.
		      System.out.println(prop.getProperty("Scannable"));
		      System.out.println(prop.getProperty("Width"));
		   }


	}

