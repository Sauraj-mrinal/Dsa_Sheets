import java.util.Scanner;

// Q7. write a java program to count how many ovels and consonents are present in the string. 
// Explanation: you have to count how many ovels and consonents are present in the string

// Ex: I/P programming

// O/P ovels are ->3

// Consonents are ->8
public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int cc=0,cs=0;
        for( int i=0; i<ch.length; i++ ){
          if( ch[i]=='a' ||ch[i]=='e'||ch[i]=='i' ||ch[i]=='o'||ch[i]=='u' ){
            cs++;
          }else if( ch[i]=='A' ||ch[i]=='E'||ch[i]=='I' ||ch[i]=='O'||ch[i]=='U' ){
            cs++;
          }else{
            cc++;
          }

        }
        System.out.println("ovels are"+cs);
        System.out.println("Consonents are "+cc);
}
}
