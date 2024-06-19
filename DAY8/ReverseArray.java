

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        System.out.println("\nReversing Array...!");
        int [] rArr = new int[size];
        for (int i=0; i<size; i++) {
            rArr[i] = arr[size-1-i];
        }
        System.out.println("\nReversed Array" + Arrays.toString(rArr));
    }
}
