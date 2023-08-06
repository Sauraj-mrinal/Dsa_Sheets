import java.util.*;

public class Patt_8{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.newInt();
        // star space method
        int space = n-1;
        int star = 1;
        int t=1;

        

            while(t<=n){

            
            // first we have to print space 
            for(int csp = 1; csp<= space ; csp++){
                System.out.print("\t");
            }
            for(int cst =1 ; cst<=star; cst++){
                System.out.print("*");
            }
             System.out.println();
             //space update
             space = space -1;
             t++;

        }

    }
}