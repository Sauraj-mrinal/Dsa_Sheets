package JavaCodes.BasicJava;
// Q42. Define a java method to count setted digit from binary conversion of user entered number?

// Explanation: Setted digits are 1 in there binary value.

// Input: 15

// Output: 4

// 15 => 1111 => Four 1's are there.
public class Q42 {
    Static int Count_Binary(int n){
        int sum =0;
        do{
            int r = n%2;
            sum = sum+r;
            n = n/2;
        }
    }
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    System.out.println(Count_Binary(n));
	}
}
