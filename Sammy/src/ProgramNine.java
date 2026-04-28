import java.util.*;

public class ProgramNine {

    public static void main(String args[]) {

        //Find duplicate numbers from an array

        int[] array = {1, 2, 3, 1, 5, 2, 4, 7, 1};

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int num : array) {
            if (!seen.add(num))       //If the number already present in seen, add in duplicates
                duplicates.add(num);
        }

        System.out.println("The duplicate elements are - " + duplicates);

    }

}
