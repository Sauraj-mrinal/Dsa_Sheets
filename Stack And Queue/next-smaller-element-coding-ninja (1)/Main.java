import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> st = new Stack<>();
       // [2,1,3,4]
        ArrayList<Integer> ans = new ArrayList<>();
              st.push(-1);
         for( int i=arr.size()-1; i>=0; i--){
             int curr = arr.get(i);
             while(st.peek()>= curr){
                 st.pop();
             }
             //ans is stack ka top
             ans.add(st.peek());
             st.push(curr);
    
         }
         Collections.reverse(ans);
         
        return ans;
    }
}