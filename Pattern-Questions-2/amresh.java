//print the pattern (butterfly)

package DSA.pattern.own_pattern;

public class amresh {

    public static void main(String[] args) {

        int n=4;
        // int m=3;

        //upper bond
        for(int i=1; i<=n; i++) {

            //inner bond (for star)
            for(int j=1; j<=i; j++) {

                if(j==1 || j==i) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }

            //inner bond for space
            for (int j=1; j<2*(n-i); j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=i; j++) {

                if(j==1 || j==i) {

                    int sum=i+j;
                    if(sum==5){
                        continue;
                    }
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

        //lower bond
        for(int i=3; i>=1; i--) {

            //inner bond (for star) 
            for (int j=1; j<=i; j++) {

                if(j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            //inner bond (for space)
            for(int j=1; j<2*(n-i); j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=i; j++) {
                if(j==1 || j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println(" ");
        }
    }
    
}
