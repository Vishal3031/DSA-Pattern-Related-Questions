//print the pattern (Triangle star pattern)

package DSA.pattern.own_pattern;

public class Triangle_star_pattern {
    
    public static void main(String[] args) {

        int n=5;
    
        //outer bond
        for (int i=1; i<=n; i++) {
    
            //inner bond (for spaces)
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }


            //inner bond (left star)
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
    
            System.out.println();
        }
    }

}
