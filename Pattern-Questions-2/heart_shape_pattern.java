// print the pattern (Heart shape pattern) 

package DSA.pattern.own_pattern;
public class heart_shape_pattern {
    
    public static void main(String[] args) {

        int n=3;
        // upper bond 
        for(int i=1; i<=n; i++) {
            //inner bond (for spaces)
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner bond (for star)
            for(int j=1; j<=2*i; j++) {
                System.out.print("*");
            } 
            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner bond (for star)
            for(int j=1; j<=i+2; j++) {
                int sum=j+i;
                if(sum==2) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        int m=6;     
        //lower bond
        for(int i=1; i<=m; i++) {

            //inner bond (for spaces)
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            //inner bond (for star)
            for(int j=1; j<=2*(m-i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
