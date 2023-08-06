package JavaCodes.BasicJava.Class_work.PATTERNS;
// 4. Write a java program to print following pattern when user enter 5:



//     1
//    21
//   321
//  4321 
// 54321
public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
       int n= scn.nextInt();
       int space = n-1;
       int star=1;
       for( int i=1; i<=n; i++) {
           
       
       for( int csp = 1; csp<=space; csp++){
           System.out.print(" ");
       }
       // star
       int x=i;
       for( int cst=1;cst<=star; cst++){
           System.out.print(x);
           x--;
       }
       System.out.println();
       space=space-1;
       star=star+1;
       }
   }
}
