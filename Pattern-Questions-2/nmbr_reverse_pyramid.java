//print the pattern (number reverse pyramid)

package DSA.pattern.own_pattern;

public class nmbr_reverse_pyramid {
    
    public static void main(String[] args) {

        int n=4;
        int m=5;

        //upper bond
        for (int i=1; i<=n; i++) {

            //inner bond
            for (int j=1; j<=m-i; j++) {
                System.out.print(j);
            }

            System.out.println();


        }
    }
}
