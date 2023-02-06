import com.google.common.primitives.Ints;
import java.util.*;

public class IntsExm {
	public static void main(String[] args)
    {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 2, 7, 0, 8 };
        int target = 2;
        
        int[] res = Ints.concat(arr1, arr2);
        
        System.out.println("Combined Array: " + Arrays.toString(res));
        
        if (Ints.contains(arr1, target))
            System.out.println("Target is present"
                               + " in the array");
        else
            System.out.println("Target is not present"
                               + " in the array");
        
        System.out.println("Maximum value is: " + Ints.max(arr1));
        
        System.out.println("Minimum value is: " + Ints.min(arr1));
        
        System.out.println("The index of target is "+Ints.indexOf(arr1, target));
        
        List<Integer> myList = Ints.asList(arr1);
        System.out.println("List of given array: " + myList);
        
        
    }
}
