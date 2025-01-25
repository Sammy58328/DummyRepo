public class VarargsExm {

    public static int sum (int... numbers) {
        int sumation = 0;
        for (int number : numbers) {
            sumation = sumation + number;
        }
        return sumation;
    }

    public static void main(String... args){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }
}
