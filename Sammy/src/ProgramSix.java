public class ProgramSix {

    public static void main(String args[]) {

        //Input : {1,2,3,4}  Output: {24,12,8,6}

        int input[] = {1,2,3,4};

        int product = 1, newProduct;

        for(int num : input)
            product *= num;

        for(int i=0; i<input.length; i++) {
            newProduct = product / input[i];
            System.out.print(newProduct);
            System.out.print(" ");
        }
    }

}
