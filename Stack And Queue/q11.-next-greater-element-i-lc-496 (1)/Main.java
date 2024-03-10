/******************************************************************************


*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 int arr[] = {1,3,2,1,8,6,3,4};
	 for( int i=0; i<arr.length ;i++){
	     System.out.print(arr[i]+" ");
	 }
	 Stack<Integer> st = new Stack<>();
	 int n = arr.length;
	  int res[] = new int[arr.length];
	  
	 // st.push(arr[n-1]);
	 for( int i = arr.length-1;i>=0; i--){
	     res[i]=-1;
	     if(st.size()==0){
	         st.push(arr[i]);
	     }else{
	         if( arr[i]<=st.peek()){
	             res[i] = st.peek();
	             st.push(arr[i]);
	         }else{
	             while(st.size()>0 && arr[i]>st.peek()){
	                 st.pop();
	             }
	             
	         }
	          
	         
	     }
	           
	 } 
	 System.out.println();
	 for( int i=0; i<res.length ;i++){
	     System.out.print(res[i]+" ");
	 }
	 // es code me thoda sa gad bad hai 
	}
}
