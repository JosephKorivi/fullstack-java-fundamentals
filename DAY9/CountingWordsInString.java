import java.util.Scanner;

public class CountingWordsInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        input.close();
        String [] arr = str.split(" ");
        System.out.println("The Number of Words in String: " + arr.length);
    }    
}
