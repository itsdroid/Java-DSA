package arrayss.practice;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 90, 33, 44, 55, 22};

        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if( arr[i] > max ) {
                max = arr[i];
            }
        } 
        System.out.println("Max num in arr: " + max);
    }
}
