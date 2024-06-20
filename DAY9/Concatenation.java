import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second String: ");
        String str2 = input.nextLine();
        input.close();
        System.out.println("Strings after the Concatenation are: " + (str1 + str2));
    }    
}
