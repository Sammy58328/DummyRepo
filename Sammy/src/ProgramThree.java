import java.util.Arrays;

public class ProgramThree {

    public static void main(String args[]){

        // Convert array {1,2,1,2,2,1,1} => {1,1,1,1,2,2,2}

        int input[] = {1,2,1,2,2,1,1} ;
        int countOnes = 0;

        for(int i =0; i<input.length; i++){

            if(input[i] == 1)
                countOnes++;

        }

        for (int j=0; j<countOnes; j++){
            input[j] = 1;
        }

        for (int k=countOnes; k<input.length; k++) {
            input[k] = 2;
        }

        System.out.println(Arrays.toString(input));

    }

}
