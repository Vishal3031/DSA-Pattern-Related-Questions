//print the pattern (number Pyramid)

public class nmber_pyramid {
    
    public static void main(String[] args) {
        int num=5;
        //upper loop
        for(int i=1; i<=num; i++) {
            //inner loop(for spcaes)
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            //inner loop (for star)
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        
        // int n=5;
        // // upper bond 
        // for(int i=1; i<=n; i++) {
        //     //inner bond (for spaces)
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     //inner bond (for star)
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
}
