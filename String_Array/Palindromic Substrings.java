// public class Palindromic Substrings {
  
// }
import java.io.*;
import java.util.*;

public class Main {
    public static boolean Is_pelindrpm(String st){
		int left_index=0;
		int right_index = st.length()-1;
     while (left_index<right_index){

            if(st.charAt(left_index) == st.charAt(right_index)){
			left_index++;
			right_index--;

		}else{
			return false;
		}
		
	 }
	 return true;
	}
		
	
	public static void solution(String str){
		//write your code here
		for(int i=0; i<=str.length(); i++){
			for( int j =i+1; j<=str.length(); j++){
				//  first we will print here substring (normal substring )

				String s = str.substring(i ,j);// that will be provide me a set of sub string with help of loop
				//System.out.println(s);// 
				//boolean val = 
				if(Is_pelindrpm(s)){
					System.out.println(s);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}