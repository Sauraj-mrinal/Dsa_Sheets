// Q5. write a java program to count how many small ovels present in the string.
//  Explanation: you have to count how many small ovels are present in the string

// Ex: I/P havEri

// O/P->> 2

public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int c=0;
        for( int i=0; i<ch.length; i++ ){
          if( ch[i]=='a' ||ch[i]=='e'||ch[i]=='i' ||ch[i]=='o'||ch[i]=='u' ){
            c++;
          } 
          

        }
        System.out.println("small ovels -->"+c);
}
}
