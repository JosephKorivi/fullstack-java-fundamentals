import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.next();
        input.close();
        boolean res = isPalindrome(str);
        System.out.println(res);
    }    

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
