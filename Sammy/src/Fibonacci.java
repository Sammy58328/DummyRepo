public class Fibonacci {

    public static void main(String args[]) {

        int n = 10; //no of terms

        int a = 0, b = 1, c;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;

            System.out.print(c + " ");

            a = b;

            b = c;
        }
    }
}
