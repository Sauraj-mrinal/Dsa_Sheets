/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    
		Stack<Integer>  st = new Stack<>();
// 		int n;
// 		System.out.println("Enter the size of  Stack you want ");
// 		n = sc.nextInt();
// 		System.out.println("Enter the Stack Element you want to insert ");
// 		for( int i=1; i<=n; i++){
// 		    int x=sc.nextInt();
// 		    st.push(x);
// 		}
     st.push(2);
     st.push(3);
     st.push(4);
     st.push(5);
     st.push(6);
     st.push(7);
     st.push(8);
	System.out.println(st);
	
	//REVERSE order 
	Stack<Integer> rt = new Stack<>();
	while(st.size()>0){
	    rt.push(st.pop());
	}
	System.out.println(rt);
	
	Stack<Integer> gt = new Stack<>();
	while(rt.size()>0){
	    gt.push(rt.pop());
	}
	
	System.out.println(gt);
	
       
		
	}
}
