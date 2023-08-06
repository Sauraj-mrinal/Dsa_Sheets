import java.util.*;

public class Patt_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();
        int star= (n/2)+1; 
        int space = 1;
        
        for(int row =1;row <= n; row++){
            
            // code for each row
            for(int cst=1;cst<=star;cst++){
                System.out.print("*\t");
            }
             
             for( int csp =1;csp<=space ;csp++){
                 System.out.print("\t");
             }
              for(int cst=1;cst<=star;cst++){
                System.out.print("*\t");
            }

            // move to next line
            System.out.println(); 

            // prepartion for next row


            // Upadtation
            if( row <= n/2){
                star= star-1;
                space= space +2;
            }
            else{
                star = star+1;
                space = space -2;

            }

        }

    }
}