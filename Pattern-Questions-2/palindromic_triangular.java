//print the pattern (palindromic triangle)

package DSA.pattern.own_pattern;

public class palindromic_triangular {
    
    public static void main(String[] args) {

        int n=5;

        // upper bond 
        for (int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for number)
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //inner bond 
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
