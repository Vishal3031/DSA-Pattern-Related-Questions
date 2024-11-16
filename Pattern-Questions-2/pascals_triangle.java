//print the pattern (pascal,s triangle)  //don't know actually or //right pascal's triangle

package DSA.pattern.own_pattern;

public class pascals_triangle {
    
    public static void main(String[] args) {

        int n=4;

        //upper bond
        for(int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            int x = 1;
            for (int j = 1; j<=i; j++) {

                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - j) / j;
            }

            System.out.println();
        }
    }
}
