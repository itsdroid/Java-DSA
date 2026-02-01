package arrays.practice;

import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 58, 46, 65, 77, 25, 90, 12 };

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        int index = linearSearch(arr, x);

        if (index != -1) {
            System.out.println(x + " is at index: " + index);
        } else {
            System.out.println(x + " not found in the array");
        }
        sc.close();
    }
}
