/******************************************************************************

kuchh nahi bs hamko yaha push krte time 
 input ->   9-(5+3)*4/6
 output->   953+4*6/-
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String infix = "9-(5+3)*4/6";
		System.out.println(" given infix-->    "+infix);
		 Stack < String > val = new Stack <> ();
		  Stack < Character> op = new Stack <> ();
		  
		  for( int i=0; i<infix.length(); i++){
		      
		      char ch  =infix.charAt(i);
		      // then first we will identify the Character is it number type or operator type
		      int ascii = (int )ch;
		      // ham Character ka ascii nikal liye ab ham ek range me chek krenge agr ye us range se belong krta hai to yah ek number hoga
		      if(ascii>=48 && ascii<=57){
		          
		          // it means that it is a number 
		          // if it is a number but right now it is a Character then we have to
		         // make it string because my requrement is for string 
		         String s = ""+ch;
		         //then if it is value then we have to put it
		         val.push(s);
		         
		         
		      }else if( op.size()==0 || ch=='(' || op.peek()=='('){
		          op.push(ch);
		      }
		      else if(ch==')'){
		          // niptaoo kam kam kro 
		          while(op.peek()!='('){
		              //work
		              String v2 = val.pop();
		              String v1 = val.pop();
		              char o = op.pop();
		              String temp = v1+v2+o;
		              val.push(temp);
		          }
		          op.pop();// '('--> hatane ke liye 
		          
		      }else{
		          if(ch=='+' || ch=='-'){
		              //work
		              String v2 = val.pop();
		              String v1 = val.pop();
		              char o = op.pop();
		              String temp = v1+v2+o;
		              val.push(temp);
		              op.push(ch);
		          }
		          
		          if(ch=='*'|| ch=='/'){
		              if(op.peek()=='*'|| op.peek()=='/'){
		                 // work
		              String v2 = val.pop();
		              String v1 = val.pop();
		              char o = op.pop();
		              String temp = v1+v2+o;
		              val.push(temp);
		              //push
		              op.push(ch);
		              }
		              else{
		                  op.push(ch);
		              }
		          }
		      }
		      
		  }
		  // yaha pr hamara for loop pura huaa hai aur 
		  // pura hone ka matalab ye hai ki hm string ko pura terverse kr liye 
		  // aagr ab bhi mera stack me element bacha hai 
		  // then one operator and two value ke sath nipatane wala kam krte rhenege
		  
		   while (val.size () > 1)
           {
            	      String v2 = val.pop();
		              String v1 = val.pop();
		              char o = op.pop();
		              String temp = v1+v2+o;
		              val.push(temp);
            
                  }
            System.out.println ("postfix-->   " + val.peek());
		  
		  
	}
}
