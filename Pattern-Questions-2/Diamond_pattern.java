package DSA.pattern.own_pattern;

public class Diamond_pattern {
    
    public static void main(String[] args) {

        int n=4;

        //upper bond
        for (int i=1; i<=n; i++) {

            // inner bond (for spaces)
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower bond
        for (int i=3; i>=1; i--) {

            //inner bond  (for spaces) 
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for star)
            for(int j=1; j<=i; j++) {

                System.out.print("* ");
            }

            System.out.println();


        }
    }
}
