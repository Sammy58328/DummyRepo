import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Listy {
	
	public static void main (String[] args) {
		
		List<String> alu = Arrays.asList("Sam", "Ram", "Jadu", "Madhu", "Ram");
		
		
		System.out.println(alu);
		
		//alu.retainAll(aly);
		
		  ListIterator<String> li = alu.listIterator(); 
		  while(li.hasPrevious())
		  System.out.println(li.previous());
		  
		  Set<String> sata= new LinkedHashSet<>(alu);
		  System.out.println(sata);
	}

}
