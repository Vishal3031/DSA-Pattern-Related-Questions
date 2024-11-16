// print the pattern (HOLLOW rectangal). 

public class Hoolow {

    public static void main(String[] args) {

        int num=7;
        //upper loop
        for(int i=1;i<=num;i++) {
            //inner loop(for star)
            for(int j=1;j<=num-1;j++) {
                // //inner condition(for space)
                if (j==1 || i==1 || j==num-1 || i==num) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // int n=7;  //upper bond //row
        // int m=6;  //inner bond //column
        
        // // upper bond
        // for (int i=1; i<=n; i++) {
        //     // inner bond 
        //     for (int j=1; j<=m; j++) {
        //         if( i==1 || j==1 || i==n || j==m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" "); 
        //         }
        //     }
        //     System.out.println();
        // }


    }

}
