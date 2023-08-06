package BasicJava;

import java.util.Scanner;

public class Q48 {
   
  
   
   String firstName;
   String lastName;
   String  birthDate;

   
    Q48(String Fname , String Lname , String Bdy){
        this.firstName = Fname;
        this.lastName = Lname;
        this.birthDate = Bdy;
    }  
    public static void main(String[] args) {
    	int id=1;
        Q48 a1 = new Q48("Sauraj", "mrinal", "16_05_1999");
        Q48 a2 = new Q48("Sauraj", "mrinal", "16_05_1999");
        Q48 a3 = new Q48("Sauraj", "mrinal", "16_05_1999");
        Q48 a4 = new Q48("Sauraj", "mrinal", "16_05_1999");
        Q48 a[] ={a1,a2,a3,a4};
        for( int i=0;i<a.length;i++){
       System.out.println(id+i);
       System.out.println(a[i].firstName);
       System.out.println(a[i].lastName);
       System.out.println(a[i].birthDate);
        }
    }  
}
