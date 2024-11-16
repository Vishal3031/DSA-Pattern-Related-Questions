//print the pattern (reverse number triangle pattern)

package DSA.pattern.own_pattern;

public class reverse_number_triangle_pattern {
    
    public static void main(String[] args) {

        int n=4;

        //outer bond
        for(int i=1; i<=n; i++) {
            
            //inner bond (for spaces)
            for (int j=2; j<=i; j++) {
                System.out.print(" ");
            }

            //inner bond
            for(int j=i; j<=n; j++) {
                System.out.print(j+ " ");
            }

            System.out.println();

        }
    }
}
