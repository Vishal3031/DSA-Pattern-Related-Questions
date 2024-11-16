//print the pattern (Hollow HourGlass Pattern)

package DSA.pattern.own_pattern;

public class Hollow_HourGlass_pattern {
    
    public static void main(String[] args) {

        int n=5;
        int m=6;

        // upper bond 
        for(int i=5; i>=1; i--) {

            // inner bond (for spaces)
            for(int j=2; j<=m-i; j++) {
                System.out.print(" ");
            }

            // inner bond (for star) 
            for (int j=1; j<=2*i-1; j++) {

                if(j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //lower bond
        for(int i=2; i<=n; i++) {

            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=2*i-1; j++) {

                if(j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
