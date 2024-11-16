// print the pattern (half number increasing pyramid) 

package DSA.pattern.own_pattern;

public class half_nmbr_increasing_pyramid {
    
    public static void main(String[] args) {

        int n=4;
    
        //upper bond
        for (int i=1; i<=n; i++) {
    
            // inner bond (for increasing number)
            for (int j=1; j<=i; j++) {
            System.out.print(j);
            }
    
            System.out.println();
        }
    }
}
