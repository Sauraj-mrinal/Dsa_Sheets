package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

import org.xml.sax.SAXParseException;

public class Q27 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int space=0; int star = n;
        int k=1;
        for( int i =1; i<=n;i++){
        	char x = (char)(64+k);
            //space
            for( int csp=1; csp<=space; csp++){
                System.out.print(" ");
            }
            // star
           
            for( int cst=1; cst<=star; cst++){
                System.out.print(x);
                if(cst<=star/2) {
                	x++;
                }else {
                	x--;
                }
            }
            System.out.println();
            if(i<=n/2){
            	k++;
                space = space+1;
                star = star-2;
            }else{
            	k--;
                space = space-1;
                star = star+2;
            }
        }
    }
}
