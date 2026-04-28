public class ProgramTen {

    public static void main(String args[]){

        //Find the missing number from array

        int[] numbers = {1,2,3,6,7,8};

        int missingNumber = -1;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] != index + 1) {
                missingNumber = index + 1;
                break;
            }
        }

        System.out.println("Missing number is " + missingNumber);

    }

}
