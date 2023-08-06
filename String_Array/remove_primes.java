// public class remove_primes {
  
// }
import java.io.*;
import java.util.*;

public class Main {

	public static boolean IsPrime(int val) {//5
		int count = 0;
		for( int i=2;i*i<=val; i++) {
			if(val%i==0) {
				count++;
			}
		}
		if(count >0) {
			return false;
		}else {
			return true ;
		}
	}
	public static void solution(ArrayList<Integer> al){
		// write your code here

		for( int lIdx = al.size()-1; lIdx >=0; lIdx--) {
			int val = al.get(lIdx);
			if(IsPrime(val)) {

               al.remove(lIdx);
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}