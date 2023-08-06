import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
         int space = n/2;
         int star=1 ;
        for(int row = 1;row <= n ;row++){
            
                 // work for sapace 
                 for (int csp = 0; csp <space;csp ++){
                     System.out.print("\t");
                 }
                 for(int cst = 0; cst<star; cst++){
                     System.out.print("*\t");
                 }
                 System.out.println();

                 // update 
                 if (row < (n+1)/2){
                     star= star+2;
                     space=space-1; 
                 }
                 else{
                     star =star-2;
                     space = space+1;
                 }
        }

    }
}