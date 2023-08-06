
import java.util.Scanner;

public class Reverse_of_No {

   public static int Pow_of_(int n){
            int temp = n-1;
            int ten_to_pow = 1;
            while(temp > 0){
                ten_to_pow  = ten_to_pow * 10;
                temp--;
            }
            return (ten_to_pow);
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        int Rnum = 0;
       
        while(num>0){

            int mod = num %10;
            // position count
            count = count +1;
             Rnum = Rnum + (count * Pow_of_(mod));
            num = num/10;

        }
        System.out.println(Rnum);


    }
}