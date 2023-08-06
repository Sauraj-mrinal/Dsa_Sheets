package JavaCodes.BasicJava.Class_work.PATTERNS;

public class Q35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int space = n/2+1;
        int star=1;
        for( int i=1; i<=n;i++){


      // space 
      for( int csp=1; csp<=space; csp++){
        System.out.print(" ");
      }
      //star
      for( int cst =1; cst<=star; cst++){
//    	  if(i==n/2||n==n/2+1) {
//    		  System.out.print("*");
//    	  }
//    	  else {
//    		  System.out.print(" ");
//    	  }
    	  if((i==n/2 && cst%2==0) || (i==(n+(n/2))/2 && cst%2==0)) {
    		  System.out.print(" ");
    	  }else {
    		  System.out.print("*");
    	  }
        
      }
      if(i<=n/2){
        star = star+2;
        space = space-1;
      }else{
        star = star-2;
        space =space+1;
      }
      System.out.println();


        }
    }
}
