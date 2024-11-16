//print the pattern (pelidromic pattern)

public class pelindromic_pattern {
    public static void main(String[] args) {
        int n=5;

        // outer bond 
        for (int i=1; i<=n; i++) {
            //inner bond (for spaces)
            for (int j=1; j<=n-i; j++ ) {
                System.out.print(" ");
            }
            //inner bond (left number)
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //inner bond(right number)
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
