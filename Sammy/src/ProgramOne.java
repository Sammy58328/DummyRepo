public class ProgramOne {

    public static void main(String args[]) {

        //Reverese a string word by word

        String input = "Programming is fun";

        String words[] = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");

    }
}
