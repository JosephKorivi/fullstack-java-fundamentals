
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        System.out.println(hs);

    }
}
