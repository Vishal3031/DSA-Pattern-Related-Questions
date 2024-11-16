//prnt thr pattern (for mirror image triangle pattern)

package DSA.pattern.own_pattern;

public class mirror_image_triangle_pattern {
    
    public static void main(String[] args) {

        int n=4;
        int m=3;

        //upper bond
        for(int i=1; i<=n; i++) {

            //inner bond (for spaces)
            for(int j=2; j<=i; j++) {
                System.out.print(" ");
            }

            //inner bond (for number)
            for(int j=i; j<=n; j++ ) {
                System.out.print(j+ " ");
            }

            System.out.println();
        }

        //lower bond
        for(int i=3; i>=1; i--) {

            // inner bond (for spaces) 
            for(int j=2; j<=i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=i; j<=n; j++) {
                System.out.print(j+ " ");
            }

            System.out.println();
        }



    }
}
