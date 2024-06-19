import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean arm = armStrong(num);
        System.out.println(arm);
    }    
    static boolean armStrong(int num) {
        int digit, sum = 0, temp;
        temp = num;
        while (num > 0) {
            digit = num % 10;
            sum += (Math.pow(digit, 3));
            num /= 10;
        }
        if(sum == temp) {
            return true;
        } else {
            return false;
        }
    }
}
