//print the pattern (inverted half pyramid with numbers)

public class inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        int a=7;
        // outer bond
        for (int i=a; i>=1; i--) {

            // inner bond 
            for(int j=1; j<=i; j++ ) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
