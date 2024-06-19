import java.util.Scanner;

public class Fibonacci{  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        fib(range);
    }
    static void fib(int range) {
        int f1 = 0, f2 = 1;
        System.out.println(f1 + " " + f2);
        for (int i =2; i<range; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}  



