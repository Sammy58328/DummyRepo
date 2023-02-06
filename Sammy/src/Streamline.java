import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamline {

	public static void main (String args[]) 
	{
		
		List<Integer> ls = Arrays.asList(2,5,3,6,7,8);
		
		Stream<Integer> sm = ls.stream();
		
//		sm.forEach(System.out::println); //stream has already been operated upon or closed

		List<Integer> esm = ls.stream().collect(Collectors.toList());
		System.out.println(esm);
		
		Stream<Integer> dsm= sm.map(n -> n*2);
		
		dsm.forEach(System.out::println);
		
		ls.stream()
					.filter(n->n%2==1)
					.sorted()
					.map(n -> n*2)
					.forEach(n-> System.out.println(n));	//Builder pattern
		
	}
}
