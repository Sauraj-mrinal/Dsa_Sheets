//29-06
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

       //Scanner scn = new Scanner(System.in);
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine(); 
       //String s = scn.nextInt();
       ArrayList<String> FinalResult = gss(s);
       System.out.println(FinalResult);
       
       }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        String  res  = str.substring(1);
        char ch = str.charAt(0);
        ArrayList<String> rres = gss(res);
       
       // create new array list 
       ArrayList<String> myList = new ArrayList<>();

        //exc
        for(String str1 : rres){
            myList.add(str1);
        }

        //include
        for(String str1 : rres){
            myList.add(ch+str1);
        } 

        
        return myList;
        
     }

}