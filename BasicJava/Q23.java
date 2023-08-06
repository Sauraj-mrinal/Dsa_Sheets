package JavaCodes.BasicJava;
// Q23. Write a java program to calculate factorial of the user entered number
// Explanation: Factorial of n is a product of all positive descending integers i.e. (n)* (n-1)* (n-2).

// Input: 5

// Output: 120
public class Q23 {
    public static void main(String[] args) {
        int num;
        int fact=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        for (int i=2;i<=num; i++){
            fact=fact*i;
        }
    
        System.out.println("Factorial: "+fact);
    } 
}
