package DSA.pattern.own_pattern;

public class butterFly_star_pattern {
    
    public static void main(String[] args) {

        int n=4;
        int m=3;

        //upper bond
        for (int i=1; i<=n; i++) {

            //inner bond (for left star) 
            for (int j=1; j<=i; j++) {
                
                System.out.print("*");
            }

            // inner bond (for spaces) 
            for( int j=1; j<2*(n-i); j++ ) {
                System.out.print(" ");
            }

            //inner bond (for right star)
            for (int j=1; j<=i; j++) {

                System.out.print("*");
                if(j==3){
                    break;
                }
            }

            System.out.println();
        }

        //lower loop
        for(int i=m; i>=1; i--) {

            //inner bond (for left star)
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //inner bond (for spaces)
            for (int j=2; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //inner bond (for right star)
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
