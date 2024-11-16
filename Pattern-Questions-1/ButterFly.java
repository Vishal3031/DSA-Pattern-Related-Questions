//print the pattern (BuuterFly Pattern)

public class ButterFly {
    public static void main(String[] args) {

        int num=4;
        // upper loop
        for (int i = 1; i<=num; i++) {
            // inner loop (for star)
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // inner loop (for spaces)
            for (int j=1; j<=2*(num-i); j++) {
                System.out.print(" ");
            }
            // inner loop(for star)
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower loop
        for(int i=num; i>=1; i--){
            //inner loop (for star)
            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            //inner loop (for spaces)
            for(int j=1; j<=2*(num-i); j++) {
                System.out.print(" ");
            } 
            // inner loop (for star)
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // int n=4;
        // //upper bond
        // for(int i=1; i<=4; i++) { //row wise

        // //inner bond (for left star)
        // for( int j=1; j<=i; j++) {
        // System.out.print("*");
        // }

        // //for spaces
        // for (int j=1; j<=2*(n-i); j++) {
        // System.out.print(" ");
        // }

        // //inner bond (for right star)
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // //replicate this

        // //lower bond
        // for (int i=n; i>=1; i--) { //row wise

        // //inner bond (for left star)
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }

        // //for spaces
        // for(int j=1; j<=2*(n-i); j++) {
        // System.out.print(" ");
        // }

        // //inner bond (for right star)
        // for(int j=1; j<=i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
    }
}
