import java.util.ArrayList;
import java.util.Comparator;


public class ArrayListu {
	
	public static void main (String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);

        oddNumbers.remove(Integer.valueOf(7));

        System.out.println(oddNumbers); 
        
        System.out.println(oddNumbers.isEmpty()); 
        System.out.println(oddNumbers.contains(5)); 
        oddNumbers.sort(Comparator.reverseOrder());
	
        System.out.println(oddNumbers); 
        
        
	}

}
