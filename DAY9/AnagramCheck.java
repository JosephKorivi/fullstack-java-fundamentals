import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = input.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = input.nextLine();

        char [] str1Ar = str1.toCharArray();
        char [] str2Ar = str2.toCharArray();

        Arrays.sort(str1Ar); Arrays.sort(str2Ar);

        System.out.println(Arrays.equals(str1Ar, str2Ar));
    }    
}
