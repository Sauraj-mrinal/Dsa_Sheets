package JavaCodes.BasicJava;

public class Q39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int EunSum=0;
        int OddSum=0;
        int diff=0;
        while(n!=0){
            int r = n%10;
            if(r%2==0){
                EunSum = EunSum+r;
            }
            else{
                OddSum = OddSum+r;
            }
            n=n/10;
        }
        if(EunSum>OddSum){
            diff = EunSum-OddSum;
        }else{
            diff = OddSum - EunSum;
        }
        System.out.println(diff);
    }
}
