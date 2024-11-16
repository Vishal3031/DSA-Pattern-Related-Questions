//print the pattern (left half pyramid)

package DSA.pattern.own_pattern;

public class left_half_pyramid {
    
    public static void main(String[] args) {

        int n=5;

        //upper bond
        for (int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for (int j=1; j<=n-i; j++) {
                
                System.out.print(" ");
            }

            //inner bond (for star)
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
