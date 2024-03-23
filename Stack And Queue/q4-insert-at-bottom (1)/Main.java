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
    		 st.push(1);  
    		 st.push(2);
             st.push(3);
             System.out.println(st);
             int val = 10;
              Stack<Integer> temp = new Stack<>();
              while( st.size()>0){
                  temp.push(st.pop());
              }
              st.push(val);
              while(temp.size()>0){
                  st.push(temp.pop());
              }
              System.out.println(st);
}
}
