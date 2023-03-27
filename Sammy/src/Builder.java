
public class Builder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("My");
		
		System.out.println(sb.append(" name").append(" is").append(" Sam").append(true));
		
		StringBuffer sf = new StringBuffer("My");
		System.out.println(sf.append(" name").append(" is").append(" Sam").append(true));
		
		//Example of Builder pattern

	}

}
