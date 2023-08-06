// Q8. write a java program to count how many capital ovels and capital consonents are present in the string.

// Explanation: you have to count how many capital ovels and capital consonents are present in the string

// Ex: I/P cHiTrAdURGa

// O/P✈ capital ovels are ->2

// Capital consonents are ->4
public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char []ch = str.toCharArray();
     int cc=0,cs=0;
        for( int i=0; i<ch.length; i++ ){
            if(ch[i]>='A' && ch[i]<='Z'){

            
                     if( ch[i]=='A' ||ch[i]=='E'||ch[i]=='I' ||ch[i]=='O'||ch[i]=='U' ){
                              cs++;
                           }else{
                                cc++;
                           }

             }
            }
        System.out.println(" capital ovels "+cs);
        System.out.println("Capital consonents "+cc);
}
