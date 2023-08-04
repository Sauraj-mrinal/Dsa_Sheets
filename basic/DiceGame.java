
  //Date  12-01-2022
 public class DiceGame {

	public static void main(String args[]){
	
	   double tempNum1 = Math.random();
	  int tempNum2  = (int)(tempNum1*10);//0-9
	  int dice1 =  ( tempNum2%6  )   +1;    //(0-9)%6  +1   =  (0-5)+1 == 1-6
	  
	   int dice2=   (  ((int)(Math.random()*10)) % 6 )+1;
	  System.out.println("dice1 number "+ dice1);
	  System.out.println("dice2 number "+ dice2);
	  
	  
	  
	}//end main

}//end class