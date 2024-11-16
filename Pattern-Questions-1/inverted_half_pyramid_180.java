
public class inverted_half_pyramid_180 {
    
    public static void main(String[] args) {

        int a=7;
        //outer loop
        for (int i=a; i>=1; i--) {

            // inner loop (for space)
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }  //there is no statement for print, then after this memory will be empty

            //inner loop (for star)
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
