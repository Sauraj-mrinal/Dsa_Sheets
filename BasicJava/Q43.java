package JavaCodes.BasicJava;
// Q43. Write a java to program to check user entered number is disarium or not? Explanation: It is a number in which the sum of the digits to the power of their respective position is equal to the number itself. (Position counted from left to right starting from 1).

// For example, 135 => 5 to power 3+3 to power 2 + 1 to power 1

// 125+9+1=135

// So 135 is disarium number.

// Input: 89

// Output: Disarium Number

// Input: 98
// what is duck number 

//Output: Not a disarium number.
public class Q43 {
    public static boolean diserium(int x)
    {
        int sum = 0; int temp = x;
        int dc = isCount(x);
        do{
            int rem = x % 10;
            sum = sum + isPower(rem,dc);
            x = x /10;
            dc--;
        }while(x !=0);
        return sum == temp;
    }
    public static int isCount(int n)
    {
        int count = 0;
        while( n!= 0)
        {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public static  int isPower(int n, int p )
    {
        int pw = 1;
        while (p>0){
            pw = pw * n;
            p--;
        }
        return pw;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();

        boolean num =  diserium(x);
        if(num == true){
            System.out.println(x+"it'a diserium number");
        }
    }
    }
    
}
