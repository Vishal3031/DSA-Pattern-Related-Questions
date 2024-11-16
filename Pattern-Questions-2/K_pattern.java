//print the pattern (K pattern)

package DSA.pattern.own_pattern;

public class K_pattern {
    
    public static void main(String[] args) {

        int n=4;

        //upper bond
        for(int i=n; i>=1; i--) {

            //inner bond
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower bond
        for (int i=1; i<=n; i++) {

            //inner bond
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
