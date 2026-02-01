package arrays.practice;

public class LargestInArray {

    static int largestInArray(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 90, 33, 44, 55, 22 };

        System.out.println("Max Element: " + largestInArray(arr,max));
    }
}
