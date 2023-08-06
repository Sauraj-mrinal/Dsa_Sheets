import java.util.*;

public class Patte_11{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n =  scn.nextInt();
        int k=1;
        for(int row =1; row <= n ; row++){
              for(int col = 1 ;col <= row ; col++ ){
                  System.out.print(k+"\t");
                  k++;
              }
              System.out.println();

        }

    }
}