//print the pattern (reverse left half pyramid)

package DSA.pattern.own_pattern;

public class reverse_left_half_pyramid {
    
    public static void main(String[] args) {

        int n=5;
        int m=6;

        //outer bond
        for (int i=1; i<=n; i++) {

            //inner bond
            for (int j=2; j<=i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=m-i; j++) {
                System.out.print("*");
            }

            System.out.println();


        }
    }
}
