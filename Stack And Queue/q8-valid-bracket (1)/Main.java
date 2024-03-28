/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{    
    public static boolean Isvalid(String s){
        
                Stack<Character> st = new Stack<>();
                       // now we will traverse all the element of string one by one so we need a for loop
             for( int i=0; i<s.length(); i++){
                    char x = s.charAt(i);
                    if(x=='(' || x=='{' || x=='['){
                        st.push(x);
                    }else{
                              // first we check our stack is empty or not 
                             // if empty the we retuen false;
                if(st.size()==0){
                    return false;
                }else{
                               // then we have to match correspondence bracket and if match then remove it 
                    if(st.peek()=='(' && x==')' ||st.peek()=='{' && x=='}' || st.peek()=='[' && x==']' ){
                        st.pop();
                    }
                     else{
                        return false;
                    }
                }
            }
        }
        if(st.size() %2 !=0 ||st.size() >0 ){
            return false;
        }
        return true ;
       
    }
    
public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	String str = scn.nextLine();
    	boolean b = Isvalid(str);
    	System.out.println(b);
    	
	}
}
