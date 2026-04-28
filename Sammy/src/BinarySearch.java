public class BinarySearch {

    public static void main(String args[]){

        int[] array = {2, 45, 63, 85, 12, 18, 25, 37, 49, 51, 62, 58, 79, 87, 93};

        int target = 51;

        System.out.println("The index after binary search is : " + binarySearch(array,target));

    }

    public static int binarySearch(int arr[], int tar){

        int left =0, right = arr.length - 1, mid;

        while(left <= right) {
            mid = left + (right - left) / 2;

            if (arr[mid] == tar)
                return mid;

            if (arr[mid] < tar)
                left = mid + 1;

            else
                right = mid - 1;
        }
        return -1;
    }

}
