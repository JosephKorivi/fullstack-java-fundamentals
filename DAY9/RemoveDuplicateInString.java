import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicateInString {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        input.close();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        System.out.println(hs);
    }
}