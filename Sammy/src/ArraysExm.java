import java.util.Arrays;
import java.util.List;

public class ArraysExm {

	public static void main(String[] args) {


		String abc[]= {"Ram", "Shyam", "Jadu"};
		
		String def[]= {"Ram", "Shyam", "Jadu"};
		
		String ghi[]= {"Ram", "Shyam", "Madhu"};
		
		int c = Arrays.binarySearch(abc, "Shyam");
		System.out.println(c);
		
		Arrays.sort(def);
		List<String> ts = Arrays.asList(def);
		System.out.println(ts);	
		
		int a = Arrays.compare(abc, ghi);
		
		System.out.println(a);		
		System.out.println(Arrays.equals(abc, def));
		String[] jkl= Arrays.copyOf(abc,2);
		List<String> ls = Arrays.asList(jkl);
		System.out.println(ls);	
		
	}

}
