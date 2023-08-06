// Q2 write a java program to count how many capital letters and small letters present in the string.
//  Explanation: you have to count how many small letters are present in the string

// Ex: I/P BanGalore

// 0/P✈ capital letters are ->3

// Small letters are -> 6

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int c=0;
        for( int i=0; i<ch.length; i++ ){
          if( ch[i]>'A' && ch[i]<='Z'){
            c++;
          } 
          if( ch[i]>'a' && ch[i]<='z'){
            cs++;
          } 

        }
        System.out.println(" Captial-->"+c);
        System.out.println(" Small -->"+cs);
    }

}
