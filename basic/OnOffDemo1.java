  //Date  12-01-2022
 public class OnOffDemo1 {

	public static void main(String args[]){
	
	  //0  off
	  //1  on
	  double  tempNum1  = Math.random();
	  //int  tempNum2  =  (int) (tempNum1*10);
	  int  tempNum2  =  (int) (tempNum1*100);  //0-99
	    //0/1
	  int requiredNum = tempNum2%2;
    	System.out.println("____________________________________________________");  
      System.out.println("requiredNum"+requiredNum);
      	System.out.println("____________________________________________________");  
/* 	
	System.out.println("int tempNum2 " + tempNum2);
	  System.out.println( tempNum2/2);
	  System.out.println( tempNum2%2);
	  System.out.println("requiredNum = "+requiredNum);
	  
 */	System.out.println("____________________________________________________");  
    System.out.println(" tempNum2 = "+ tempNum2);
    System.out.println("____________________________________________________");
   // System.out.println();
    System.out.println("requiredNum " + requiredNum);
 
    if(requiredNum==0){
	  System.out.println("OFF");
	}else{
	  System.out.println("ON");
	}
    
 String option=null;
 
   if(requiredNum==0){
	 option="no";
	}else{
	 option="yes";

	}
 
 
 System.out.println("option = " + option);
 
   boolean bool  = false;
   if(requiredNum==0){
	 bool  = false;
	}else{
	bool  = true;
	}
 System.out.println("bool = " + bool);
 
 
	}//end main

}//end class