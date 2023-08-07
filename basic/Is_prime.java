import java.util.*;
  
  public class Is_prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
    //    // write ur code here
    //    int n = scn.nextInt();
    //    for(int i=1;i<=n;i++){
    //        num = new int 

    //    }


       // first we will write  number i sprime ofr not 
       int number = scn.nextInt();
     
       for(int start = 1 ; start<= number; start++){

         int count=0;
               for(int i=2; i<start; i++){
                 if(start % i == 0){
                       count=1;
                  }
               }
       if(count != 0){
           System.out.println("not prime");
       }
       else{
           System.out.println("prime");
       }
       }
  
   }
  }