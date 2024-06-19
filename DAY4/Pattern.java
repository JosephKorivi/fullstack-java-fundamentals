public class Pattern {
    public static void main(String[] args) {
        int n = 6; 
        char ch;

        for (int i = 0; i < n; i++) {
            ch = 'A';
            // Print the first part of the pattern
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            
            // Print the spaces in the middle
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("  ");
            }
            
            // Print the second part of the pattern
            if (i != 0) {
                ch--;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(ch + " ");
                    ch--;
                }
            } else {
                ch--;
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(ch + " ");
                    ch--;
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
