// public class Toggle_optical_doc {
  
// }
import java.io.*;
import java.util.*;

public class Main {

		public static String toggleCase(String str){
           
		   StringBuilder sb = new StringBuilder();

			for( int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				// here we have 2 case 
				// case 1: lower case to upper case convertation 
				// case 2 : upper case to lower case con....
				if(ch>='a' && ch<= 'z'){
					// then change into upper case 
					// we hVE FORMULA THAT IS DISCUSS IN NOTEBOOK PLEASE GO AND RED 

					char uc = (char)((ch -'a') + 'A');// this is ASCI VAL FORMULA 
					// HW=ERE ALL CHAR TREATE AS INTEGER VALUE 
					// SO WHEN EVER ANY INT CHANGE TO CHAR "WE SHOULD USE (char) BEFOR ASSIGINING THE VAKUE "
                    
					// assing the value in string bulider 
					sb.append(uc);

				}else if(ch>='A' && ch<= 'Z'){
					//CHANGE INTO UPPER CASE TO LOWER CASE 
					//AGAIN WE WILL USE THE FORMULA
					char lc = (char)((ch -'A') + 'a');
					sb.append(lc);

				}

				
			}
			return sb.toString();
		}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}