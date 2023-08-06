package JavaCodes.BasicJava.Class_work.PATTERNS;

public class Q14 {
    public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int space  = n-1;
	    int star = 1;
	    int csp=1;
	    int x=1;
	    for( int i=1; i<=n; i++){
	        // space 
	        for(  csp=1; csp<=space; csp++){
	            System.out.print(" ");
	        }
	        // star
	       
	        char ch =(char)(96+i);
	       // System.out.println(ch);
	        for( int cst =1; cst<=star; cst++){
	       
	        	System.out.print(ch);
	        	if(cst<=star/2) {
	        		ch--;
	        	}else {
	        		ch++;
	        	}
	        	
	        	
	            
	        }

	        System.out.println();
	        space=space-1;
	        star=star+2;
	    }
	  }
}
