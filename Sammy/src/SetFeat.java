import java.util.Set;
import com.google.common.collect.Sets;

public class SetFeat {
	
	public static void main (String args[]) 
	{
	Set<Integer> s1 = Sets.newHashSet(1,5,5,6,8,9);
	Set<Integer> s2 = Sets.newHashSet(5,6,3,7);	
	
	Set<Integer> s3 = Sets.union(s1,s2);
	Set<Integer> s4 = Sets.intersection(s1,s2);
	Set<Integer> s5 = Sets.difference(s1,s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	}
	}