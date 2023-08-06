import java.util.*;

public class Patt_16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int star = 1;
    int t= n*2;
    int space = t-3;
    for(int row = 1; row <=n ; row++){

         int val=1;

        for(int cst = 1; cst<=star; cst++){
            System.out.print(val+"\t");
            val++;
        }
        for(int csp = 1;csp<=space; csp++){

              System.out.print("\t");
        }
        int tempVal= val;
        if(star==n) star= star-1;
        for(int cst = 1; cst<=star; cst++){
           tempVal--;
            System.out.print(tempVal+"\t");
           // tempVal--;

        }
        System.out.println();
        // update
        star =star+1;
        space = space -2;
    }

     // write ur code here

 }
}