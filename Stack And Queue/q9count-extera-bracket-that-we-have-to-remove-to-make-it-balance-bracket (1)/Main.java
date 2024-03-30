/******************************************************************************

we have to count number of bracket that we have to remove to make it valid 
*******************************************************************************/
import java.util.*;
public class Main
{    
    public static int Isvalid(String s){
               int count=0;
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
                    count++;
                }else{
                               // then we have to match correspondence bracket and if match then remove it 
                    if(st.peek()=='(' && x==')' ||st.peek()=='{' && x=='}' || st.peek()=='[' && x==']' ){
                        st.pop();
                    }
                     else{
                        count++;
                    }
                }
            }
        }
        if(st.size() %2 !=0 ||st.size() >0 ){
            count++;
        }
        return count ;
       
    }
    
public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	String str = scn.nextLine();
    	int b = Isvalid(str);
    	System.out.println(b);
    	
	}
}
