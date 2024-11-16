//print the pattern (half pyramid of numbers)

// package DSA.pattern;
import java.util.*;
public class half_pyramid_of_number {
    
    public static void main(String[] args) {
        int n;
        System.out.println("enter number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        // outer bond
        for(int i=1; i<=n; i++) {

            // inner bond 
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
