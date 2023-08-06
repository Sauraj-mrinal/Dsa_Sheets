package JavaCodes.BasicJava;

public class Q41 {
    static int  Average_of_no(int n){
        int count=0;
        int sum=0;
        while(n!=0){
            int r = n%10;
            count++;
            sum=sum+r;
            n = n/10;
        }
        return sum/count;
    }
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    System.out.println(Average_of_no(n));
	}
}
