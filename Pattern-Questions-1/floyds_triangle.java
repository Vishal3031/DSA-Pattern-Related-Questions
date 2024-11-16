//print the pattern (Floyd's triangle)

public class floyds_triangle {
    public static void main(String[] args) {
        int num=5;
        int number=1;

        // upper loop
        for(int i=1; i<=num; i++) {
            //inner loop
            for(int j=1; j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


        // int n=5;
        // int number=1;

        // // upper bond
        // for (int i=1; i<=n; i++) {

        //     // inner bond
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(number+ " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

    }
}
