import java.util.Scanner;

// Q3 write a java program to count how many small letters present in the string.

// Explanation: you have to count how many small letters are present in the string

// Ex: I/P DhArWaDa

// O/P✈ 4
public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int cs=0;
        for( int i=0; i<ch.length; i++ ){
          
          if( ch[i]>'a' && ch[i]<='z'){
            cs++;
          } 

        }
        System.out.println(" small -->"+cs);
    }
}
