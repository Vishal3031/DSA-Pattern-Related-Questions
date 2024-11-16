//print the pattern (number changing pyramid)

package DSA.pattern.own_pattern;

public class nmbr_changing_pyramid {
    

    public static void main(String[] args) {

        int n=4;
        int number=1;

        //upper bond
        for (int i=1; i<=n; i++) {

            //inner bond
            for (int j=1; j<=i; j++) {
                System.out.print(number);
                number++;
            }

            System.out.println();
        }
    }

}
