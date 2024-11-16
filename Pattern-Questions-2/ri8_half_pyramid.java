package DSA.pattern.own_pattern;

public class ri8_half_pyramid {
    
    public static void main(String[] args) {

        int n=5;

        //upper bond 
        for(int i=1; i<=n; i++) {

            // inner bond 
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
