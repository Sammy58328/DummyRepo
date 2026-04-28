public class PatternTwo {

    public static void main(String args[]) {

        //Make a Diamond with Stars

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int k = (n - i); k > 0; k--)
                System.out.print(" ");

            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++)
                System.out.print(" ");

            for (int k = 0; k < 2 * (n - i) - 1; k++)
                System.out.print("*");

            System.out.println();

        }
    }

}
