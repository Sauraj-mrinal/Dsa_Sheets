import java.util.*;


public class Patt_13{
    public static int fact(int n){
               int factOf_n=1;
               if(n>0){
                               
                while(n>0){
                  factOf_n *=n;
                   n--;
               }
               }
         // cout<<factOf_n;
                 return factOf_n;
           

        }  

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       int size = scn.nextInt();
        //write your code here
          
           for(int i=0; i<=size; i++){
            for(int j=0; j<=i; j++){

                                        int nr=fact(i);
                                        int r1=fact(j);
                                        int r2=fact(i-j);
                                        int R= r1*r2;
                                        int result = nr /R;
                                         System.out.print(result+"\t");
                                   }
                                   System.out.println();
                               }

                              
        

    }
}