public class ProgramTwo {

    public static void main(String args[]) {

        //count letter and integer from a string

        String input = "Hello123Programming456";

        int letterCount = 0, numberCount = 0;

        for (int i = 0; i < input.length(); i++) {

            char numCh = input.charAt(i);

            if (Character.isLetter(numCh))
                letterCount++;

            if (Character.isDigit(numCh))
                numberCount++;

        }

        System.out.println("Letter Count is - " + letterCount);
        System.out.println("Letter Count is - " + numberCount);

    }
}
