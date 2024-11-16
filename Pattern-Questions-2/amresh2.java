// print the pattern (lamp) 

package DSA.pattern.own_pattern;

public class amresh2 {
    
    public static void main(String[] args) {

        int n=6;
        int m=4;
        //upper bond
        for(int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<2*i; j++) {

                // int sum=i+j;

                if(j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        //middle bond 
        for(int i=1; i<=m; i++) {

            //inner bond(for middle spaces)
            for( int j=1; j<=5; j++) {
                System.out.print(" ");
            } System.out.print("*");

            System.out.println();

        }

        // //lower bond
        for (int i=1; i<=m; i++) {

            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=2*i-1; j++) {

                if( j==1 || i==m || j==2*i-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
