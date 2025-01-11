import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Proj {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			Random rand = new Random();
			int j = 100+rand.nextInt(999);
			ls.add(j);
			
			int k = rand.nextInt(9999);
			ls.add(k);
		}
		System.out.println(ls);
		
		String ss = "Samrat";
		System.out.println(ss.substring(1));
	}

}
