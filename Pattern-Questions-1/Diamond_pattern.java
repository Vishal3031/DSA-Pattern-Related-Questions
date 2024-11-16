//print the pattern (Diamond pattern)

public class Diamond_pattern {
    
    public static void main(String[] args) {

        int row=6;
        //upper loop
        for(int i=0; i<row; i++) {
            //inner loop (for spaces)
            for(int j=1; j<row-i; j++) {
                System.out.print(" ");
            }
            //inner loop (for star)
            for(int j=1; j<=(2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower loop
        for(int i=1; i<=row-1; i++) {
            //inner loop (for spaces)
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            //inner loop (for star)
            for(int j=1; j<2*(row-i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // int n=4;

        // //outer bond
        // for(int i=1; i<=n; i++) {

        //     //inner bond (for spaces)
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     //inner bond (for left one)
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }

        //     //inner bond (for right one)
        //     for (int j=2; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // lower bond 
        // for (int i=n; i>=1; i--) {

        //     // inner bond (for spaces)
        //     for (int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     //inner bond (for left star)
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }

        //     //inner bond (for right star)
        //     for (int j=2; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
