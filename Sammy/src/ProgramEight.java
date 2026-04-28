import java.util.Arrays;

public class ProgramEight {

    public static boolean isAnagram(String firstWord, String secondWord){

        //Anagram means same letters in the word can be shuffled to make another word

        char[] a = firstWord.toCharArray();
        char[] b = secondWord.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b); //no need of if-else if the return type is boolean
    }

    public static void main(String args[]){
        String first = "silent";
        String second = "listen";

        System.out.println("Is both the Strings anagram - " + isAnagram(first,second));
    }

}
