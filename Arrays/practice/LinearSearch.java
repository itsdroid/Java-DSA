package Arrays.practice;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {58,46,65,77,25,90,12};

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();
        for( int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                System.out.println(x + " is at position: " + i );
                break;
            }
        }
        sc.close();
    }
}
