package JavaCodes.BasicJava;
// Q24. Write a java program to check whether given number is Armstrong or not? 
// Explanation: Armstrong number are positive m-digit number that is equal to the sum of the mth

// 153=1+125 +27= 153 So 153 is Armstrong number.
// Input: 125
// Output: Not an Armstrong number
// Input: 370
// Output: Armstrong number




public class Q24 {
    static int Find_pow(int n,int p){
        int res=1;
        do{
            res=res*n;
            p--;
        }while(p>0);
        return res;
    }
    static int Find_no_of_digit(int n){
        int count =0;
        do{
            n =n/10;
            count++;
        }while(n!=0);
        return count;
    }
    static boolean CheckArmstrong(int num, int p){
        int sum=0;
        int t=num;
          do{
            int rem = num%10;
            sum = sum+Find_pow(rem,p);
            num=num/10;
          }while(num!=0);
          return t==sum;
    }
    public static void main(String[] args) {
        
    
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int dig_count = Find_no_of_digit( n);
        boolean b= CheckArmstrong (n ,dig_count);
        if(b){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }

    }
}
