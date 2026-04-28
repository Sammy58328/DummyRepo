import java.util.LinkedHashSet;

public class ProgramFour {

    public static void main(String args[]){

        //Remove duplicate words from String

        String input = "Welcome to Walmart today Walmart to days";

        String words[] = input.split(" ");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(); //LinkedHashSet can't have duplicate values

        for(String word : words)
            uniqueWords.add(word);

        StringBuilder s = new StringBuilder();
        for(String word : uniqueWords)
            s.append(word).append(" ");

        System.out.println(s);
    }

}
