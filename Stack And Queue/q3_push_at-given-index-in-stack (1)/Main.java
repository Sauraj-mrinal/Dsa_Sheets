/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer>  st = new Stack<>();
    		 st.push(11);  
    		 st.push(21);
             st.push(13);
             st.push(14);
             st.push(51);
             st.push(61);
             int k=2;
             int val = 7;
             System.out.println(" before push");
             System.out.println(st);
             // we will create an temp stack 
             Stack<Integer>  rt = new Stack<>();
             // now my empty stack is created 
             // using loop first we will to pop the element ofstack one by one 
             while(st.size()>k){
                 rt.push(st.pop());
             }
             st.push(val);
             while( rt.size()>0){
                 st.push(rt.pop());
             }
        System.out.println(" after push ");
     
          System.out.println(st);;
	}
}
//