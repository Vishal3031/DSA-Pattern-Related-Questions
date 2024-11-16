// printe the pattern (for right pascal's pattern) 

package DSA.pattern.own_pattern;

public class Right_pascals_pattern {

    public static void main(String[] args) {

        int n=4;
        int sum,add;

        //upper bond
        for(int i=1; i<=n; i++ ) {

            //inner bond
            for(int j=1; j<=i; j++) {

                // System.out.print('*'); 

                sum=i+j;
                if (sum%2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }



        //lower bond
        for(int i=1; i<=n-1; i++) {

            //inner bond 
            for (int j=1; j<=n-i; j++) {

                // System.out.print("*");

                add=i+j;
                if (add%2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
}
