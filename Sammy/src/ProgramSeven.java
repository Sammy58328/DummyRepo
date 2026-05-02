import static java.lang.Character.*;

public class ProgramSeven {

    public static void main(String args[]) {

        //input = "(Sam%r&atRak*sh!t)"
        //Reverse the String without changing the special characters

        String input = "(Sam%r&atRak*sh!t)";

        String word = "", revWord = "", newWord = "";
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i)))
                word = word + input.charAt(i);
        }

        StringBuilder sb = new StringBuilder(word);
        revWord = sb.reverse().toString();

        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i)))
                newWord = newWord + revWord.charAt(index++);
            else
                newWord = newWord + input.charAt(i);
        }

        System.out.println(newWord);

    }
}
