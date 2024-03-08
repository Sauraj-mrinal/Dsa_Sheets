/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
	  Stack<Integer> st = new Stack<>();
	   System.out.println(st.isEmpty());
	  st.push(1);
	  System.out.println(st.isEmpty());
	  System.out.println("size = "+st.size());
	  st.push(23);
	  System.out.println("size = "+st.size());
	  st.push(90);
	  System.out.println("size = "+st.size());
	  st.push(33);
	  System.out.println("size = "+st.size());
	  st.push(45);
	  System.out.println("size = "+st.size());
	  // peek()- it is use to see the top element of stack 
	  System.out.println(st.peek());//45
	  System.out.println(st);// use to print all the element v
	  
	  System.out.println("size = "+st.size());
	  while(st.size()>1){
	      st.pop();
	  }
	  System.out.println(st.peek());
	  System.out.println(st);
	   
	}
}
