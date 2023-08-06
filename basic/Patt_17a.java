import java.util.*;

public class Patt_17a {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star =1 ;
        int space =  n/2;
        int row = 1;
        for(  row = 1; row <= n; row ++){
             
              for(int csp = 1;csp<= space; csp++){
                  if( row== n/2 +2){
                    System.out.print("*\t");
               }else{
                 System.out.print("\t");

               }
                   
              }
               

                 for(int cst = 1; cst< star; cst++){
                System.out.print("*\t");
            }

            System.out.println();
            // update 

            if(row<=n/2+1){
                star++;
            }else{
                star--;
            }
            // if( row == (n/2)+1){

            //     for (int i=1;i<=row-1;i++){
            //        
            //     }
           // }
            

        }
       
       

    }
}