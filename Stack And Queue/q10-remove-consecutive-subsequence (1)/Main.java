/******************************************************************************

given a squence of number Remove all the consecutive subsequences of 
length greater or equal to 2 that contain the same element 
 [1 2 2 3 10 10 10 4 4 4 5 7]
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int[] Remove(int [] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n-1; i++){
            if(st.size()==0|| st.peek()!=arr[i]){
                st.push(arr[i]);
            }else{
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
            
        }
        int res[] = new int [st.size()];
            int m = res.length;
            for( int j = m-1; j>=0; j--){
                res[j] = st.pop();
            }
            
            return res;
    }
	public static void main(String[] args) {
	
		 int[]arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
		 
		 int res[] = Remove(arr);
		 for( int i=0; i<res.length; i++){
		     System.out.print(res[i]+" ");
		 }
	}
}
