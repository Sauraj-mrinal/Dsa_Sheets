import java.util.Arrays;
import java.util.Scanner;

public class Move_negative_ele {

    public static void shiftIntegers(int arr[], int n) {
        
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <n; j++) {
            if (arr[i] < 0 && arr[j]>0) {

                int J_pos = j;
                int i_pos = i;
                int temp = arr[j];

                for( int index = J_pos; index>= i_pos; index --){
                  arr[index]=arr[index -1];

                }
                arr[i_pos]= temp;
            }
            }
        }
    }

    public static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        Arrays.sort(arr);
//        for(int ele:arr){
//            System.out.println(ele);
//        }
        shiftIntegers(arr, n);
        printArray(arr, n);


    }
}