import java.util.List;
import com.google.common.collect.Lists;

public class ListtFeat {
	
	public static void main (String args[]) 
	{
	List<Integer> s1 = Lists.newArrayList(1,6,5,9,8,5);
	List<Integer> s2 = Lists.reverse(s1);
	
	System.out.println(s1);
	System.out.println(s2);
	
	List <List<Integer>> p = Lists.partition(s1, 2);
	p.forEach(System.out::println);


	} 
	}