import java.util.*;

public class ListError {

	public static void main(String... args)  {

		try {
		List<Integer> le = new ArrayList<>();
		le.add(5);
		le.add(6);
		le.add(7);
		
		System.out.println(le);
			
		List<Integer> lt = Collections.unmodifiableList(le);
		//lt.add(9);
		
		List<Integer> lm = Arrays.asList(5,8,7,3);
		//lm.add(9);
		
		List<Integer> ln = List.of(1,5,6,7); //Feature of JAVA 9
		ln.add(9);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
