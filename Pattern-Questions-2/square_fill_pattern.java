//print the pattern (Square fill pattern)

package DSA.pattern.own_pattern;

public class square_fill_pattern {

    public static void main(String[] args) {

        int n=6;

        //upper bond
        for(int i=1; i<=n; i++) {

            // inner bond 
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

    }
    
}
