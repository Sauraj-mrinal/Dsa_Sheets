import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void shiftIntegers(int arr[], int n) {
       int temp = 0;
       int i_pos= 0; //                      [-5 , 7 - 3 ,-4 ,9 ,10, -1, 11]
      //                                          0   1   2   3  4  5    6   7
        for (int i = 0; i <n; i++) {
            for (int j  = i+1; j <n; j++) {

            if (arr[i] < 0 && arr[j]>0) {

                
                int J_pos = j;
                 i_pos = i;
                 temp = arr[J_pos];
                

                for( int index = J_pos; index>= i_pos; index --){

                  arr[index]=arr[index -1];


                  //System.out.print(index);


                }
            }
             
         }
            arr[i_pos-1]= temp;
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