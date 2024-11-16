//print the pattern (number triangle)

package DSA.pattern.own_pattern;

public class number_triangle {
    
    public static void main(String[] args) {

        int n=5;

        // upper bond 
        for (int i=1; i<=n; i++) {

            // inner bond (for spaces)
            for (int j=1; j<=n-i; j++ ) {
                System.out.print(" ");
            }

            //inner bond (for number)
            for(int j=1; j<=i; j++) {
                System.out.print(i+ " ");
            }

            System.out.println();
        }
    }
}
