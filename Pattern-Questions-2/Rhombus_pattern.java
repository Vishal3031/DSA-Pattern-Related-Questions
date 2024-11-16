//print the pattern (Rhombus pattern)

package DSA.pattern.own_pattern;

public class Rhombus_pattern {
    
    public static void main(String[] args) {

        int n=5;
        int m=4;
    
        //upper bond
        for (int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for (int j=2; j<=i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }

            System.out.println();
    
        }
    }
}
