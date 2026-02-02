package arrays.practice;

class ReverseArray {
    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        int temp;

        while(first <= last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first = first + 1;
            last = last - 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}