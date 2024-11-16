//print the pattern (solid rhombus)

public class Solid_rhombus {
    
    public static void main(String[] args) {

        int n=5;
        //upper bond
        for( int i=1; i<=n; i++) {
            //inner bond (for spaces)
            for (int j=4; j>=i; j--) {
                System.out.print(" ");
            }
            //inner bond (for star)
            for( int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
