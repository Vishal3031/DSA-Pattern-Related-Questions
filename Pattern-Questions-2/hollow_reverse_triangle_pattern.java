//print the pattern (Hollow Diamond Pyramid)

package DSA.pattern.own_pattern;

public class hollow_reverse_triangle_pattern {
    
    public static void main(String[] args) {

        int n=6;
        int m=7;

        // upper bond 
        for(int i=n; i>=1; i--) {

            //inner bond (for spaces)
            for(int j=2; j<=m-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=2*i-1; j++) {

                if(i==n || j==1 || j==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
