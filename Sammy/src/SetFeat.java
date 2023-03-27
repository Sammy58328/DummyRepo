import java.util.LinkedHashSet;
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
	
	Set<Integer> s6= new LinkedHashSet<Integer>() 
	{
		{
		add(12);
		add(18);
		add(24);
		add(30);
		add(36);
		add(42);
		add(48);
		}
		
	};
	
	Set<Integer> s7= new LinkedHashSet<Integer>() 
	{
		{
		add(30);
		add(36);
		add(42);
		add(54);
		add(60);
		}
		
	};
	s6.addAll(s7);  //Union
	
	System.out.println(s6);
	
	Set<Integer> s8= new LinkedHashSet<Integer>() 
	{
		{
		add(12);
		add(18);
		add(24);
		add(30);
		add(36);
		add(42);
		add(48);
		}
		
	};
	
	Set<Integer> s9= new LinkedHashSet<Integer>() 
	{
		{
		add(30);
		add(36);
		add(42);
		add(54);
		add(60);
		}
		
	};
	
	s8.retainAll(s9); 	//Intersection
	System.out.println(s8);
	
	Set<Integer> s10= new LinkedHashSet<Integer>() 
	{
		{
		add(12);
		add(18);
		add(24);
		add(30);
		add(36);
		add(42);
		add(48);
		}
		
	};
	
	Set<Integer> s11= new LinkedHashSet<Integer>() 
	{
		{
		add(30);
		add(36);
		add(42);
		add(54);
		add(60);
		}
		
	};
	
	s10.removeAll(s11);	//Difference
	System.out.println(s10);
	
	}
	}