import java.util.*;

public class ProgramFour {

    public static void main(String args[]){

        //Remove duplicate words from String

        String input = "Welcome to Walmart today Walmart to days";

        String words[] = input.split(" ");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(); //LinkedHashSet can't have duplicate values

        for(String word : words)
            uniqueWords.add(word);

        Iterator it = uniqueWords.iterator();

        while(it.hasNext())
            System.out.print(it.next()+ " ");

    }

}
