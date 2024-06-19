
import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    static int [] minMax (int [] arr, int low, int high) {
        int [] res = new int [2];
        if (low == high) {
            res[0] = res[1] = arr[low];
        } else if (low == high - 1) {
            if(arr[low] < arr[high]) {
                res[0] = arr[low]; res[1] = arr[high];
            } else {
                res[0] = arr[high]; res[1] = arr[low];
            }
        } else {
            int mid = low + (high - low) / 2;
            int [] leftRes = minMax(arr, low, mid);
            int [] rightRes = minMax(arr, mid+1, high);
            int min1 = leftRes[0];
            int max1 = leftRes[1];
            int min2 = rightRes[0];
            int max2 = rightRes[1];

            res[0] = Math.min(min1, min2);
            res[1] = Math.max(max1, max2);
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int [] res = minMax(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(res));
    }
}
