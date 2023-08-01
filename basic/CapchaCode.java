public class CapchaCode{

	public static void main(String args[]){
	  
	   
	   //65-90
	   int temp1Upper  = (int)(Math.random()*100);//0-99
	 int upperAlphaAscii =   temp1Upper%26  +65;  // //65-90
	   
	  
	   int temp1Lower  = (int)(Math.random()*100);//0-99
	 int lowerAlphaAscii =   temp1Lower%26  +97;  // //97-122
	   
	  char upperAlphabet =(char) upperAlphaAscii;
	  char lowerAlphabet =(char) lowerAlphaAscii;
	   int num1  = (int)(Math.random()*10);//0-9
	   int num2  = (int)(Math.random()*10);//0-9
	  
	  
	  //logic   UC  + n1  + LC  +n2
	  String generatedCaptchaCode  ="";
	  generatedCaptchaCode = generatedCaptchaCode + upperAlphabet;
	  generatedCaptchaCode = generatedCaptchaCode + num1;
	  generatedCaptchaCode = generatedCaptchaCode + lowerAlphabet;
	  generatedCaptchaCode = generatedCaptchaCode + num2;
	  
	  System.out.println("your captch code is " + generatedCaptchaCode);
	  
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("enter  above captcha code");
	  String userEnteredCaptchaCode  =scan.next();
	  
	 if(generatedCaptchaCode.equals(userEnteredCaptchaCode)){
	   System.out.println("matched catpcha code");
	 }else{
	   System.out.println("NOT matched catpcha code");
	 
	 }
	  
	  
	  
	}//end main

}//end class