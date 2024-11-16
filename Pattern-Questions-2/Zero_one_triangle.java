//print the pattern (Zero one triangle)

package DSA.pattern.own_pattern;

public class Zero_one_triangle {
    
    public static void main(String[] args) {

        int n=4;
        int sum;

        //outer bond
        for (int i=1; i<=n; i++) {
            
            //inner bond
            for (int j=1; j<=i; j++) {

                sum= i+j;

                if (sum%2 == 0) {
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
}
