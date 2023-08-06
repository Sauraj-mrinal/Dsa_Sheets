
//Q1 write a java program to count how many CAPITAL letters present in the string. Explanation: 
//you have to count how many CAPITAL letters are present in the string

//Ex: I/P Bangalore

//O/P> 3
public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int c=0;
        for( int i=0; i<ch.length; i++ ){
          if( ch[i]>'A' && ch[i]<='Z'){
            c++;
          }       
        }
        System.out.println(c);


        }
}
