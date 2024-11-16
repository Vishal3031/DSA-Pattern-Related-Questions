//print the pattern (Hollow_Diamond pattern)

package DSA.pattern.own_pattern;

public class Hollow_Diamond_Pyramid {
    
    public static void main(String[] args) {

        int n=8;
        int m=7;

        //upper bond
        for(int i=1; i<=n; i++) {

            // inner bond (for spaces) 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star) 
            for(int j=1; j<=2*i-1; j++) {

                if(j==1 || j==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //lower bond
        for(int i=m; i>=1; i--) {

            //inner bond (for spaces) 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for (int j=1; j<=2*i-1; j++) {

                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
