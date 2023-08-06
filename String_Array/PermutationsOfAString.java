
import java.io.*;
import java.util.*;

public class PermutationsOfAString{

	public static void solution(String str){
		// write your code here
		int n = str.length(); 
		int fact =1;
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		for(int i=0; i<fact; i++){
			StringBuilder sb = new StringBuilder(str);
			int num=i;
			for(int div = n; div>=1;div--){
				int r = num%div;
				num=num/div;
				char c = sb.charAt(r);
				System.out.print(c);
				sb.deleteCharAt(r);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}