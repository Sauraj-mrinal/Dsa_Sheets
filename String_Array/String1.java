import java.util.*;

import javax.security.sasl.SaslException;
public class String1 {

  public static void main(String[] args){

    // string declaration 
    String s = "Mrinal";
    System.out.println(s);

    // seccond way 
    String s1 = new String("Mrinal");
    System.out.println(s1);



   // for input of string 
   //if you want to tack input without space then 
  Scanner scn = new Scanner(System.in);
  String s3 = scn.next();
  System.out.println(s3);

  // for multiple space input 
  String s4 = scn.nextLine();
  System.out.println(s4);

  // if i want to print each char of string 
  // we have a function charAT();
  for(int i =0; i<s4.length();i++){
    char ch = s.charAt(i);
  }
  }
}