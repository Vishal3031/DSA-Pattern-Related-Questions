//print the pattern (square hollow pattern)

package DSA.pattern.own_pattern;

class square_hollow_pattern
{

    public static void main(String[] args) {

        int n=6;
        int m=5;

        // outer bond
        for (int i=1; i<=n; i++) {

            //inner bond 
            for (int j=1; j<=m; j++) {

                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
