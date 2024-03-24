/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
// in this program we have to reverse the same given Stack
public class Main
{
	public static void main(String[] args) {
			Stack<Integer>  st = new Stack<>();
    		 st.push(1);  
    		 st.push(2);
             st.push(3);
             st.push(4);
             System.out.println(st);
         
              Stack<Integer> temp1 = new Stack<>();
               Stack<Integer> temp2 = new Stack<>();
              while(st.size()>0){
                  temp1.push(st.pop());
              }
               while(temp1.size()>0){
                  temp2.push(temp1.pop());
              }
              while(temp2.size()>0){
                  st.push(temp2.pop());
              }
              System.out.println(st);
             
}
}
