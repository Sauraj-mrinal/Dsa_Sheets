import java.util.Scanner;

// Q4. write a java program to count how many capital ovels present in the string.

// Explanation: : you have to count how many capital ovels are present in the string

// Ex: I/P programming

// O/P-2

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int c=0;
        for( int i=0; i<ch.length; i++ ){
          if( ch[i]=='A' ||ch[i]=='E'||ch[i]=='I' ||ch[i]=='O'||ch[i]=='U' ){
            c++;
          } 
          

        }
        System.out.println("capital ovels -->"+c);
}
}
