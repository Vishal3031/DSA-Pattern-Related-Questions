//print the pattern (0,1 triangle)

public class triangle_01 {

    public static void main(String[] args) {

        int n=5;
        // outer bond 
        for (int i=1; i<=n; i++) {
            //inner bond
            for (int j=1; j<=i; j++) {    
                int sum=i+j;
                if(sum%2 == 0) {     //if even
                    System.out.print(1+ " ");
                } else {
                    System.out.print(0 +" ");    //if odd
                }
            }
            System.out.println();
        }
    }
}
