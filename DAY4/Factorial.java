import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = findFact(num);
        System.out.println(fact);
    }
    static int findFact(int num) {
        int f = 1;
        for (int i=1; i<=num; i++) {
            f *= i;
        }
        return f;
    }    
}
