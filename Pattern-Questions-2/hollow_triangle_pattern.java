//print the pattern (Hollow triangle pattern)

package DSA.pattern.own_pattern;

public class hollow_triangle_pattern {
    
    public static void main(String[] args) {

        int n=5;

        //upper bond
        for(int i=1; i<=n; i++) {

            // inner bond (for spaces) 
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner bond (for left star)
            for(int j=1; j<=2*i-1; j++) {

                if(j==2*i-1 || j==1 || i==n) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

    }
}
