//print the pattern (reverse right half pyramid)

package DSA.pattern.own_pattern;

public class reverse_ri8_half_pyramid {
    
    public static void main(String[] args) {

        int n=5;
    
        //upper bond 
        for(int i=n; i>=1; i--) {
    
            //inner bond
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
    
            System.out.println();
        }
    }
}
