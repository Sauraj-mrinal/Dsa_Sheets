//import .util*;
import java.util.*; 

public class Arr_of{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int idx =0; idx <n; idx ++){
      arr[idx] = scn.nextInt();

    }
    printArr(arr ,0);
    scn.close();
  }

  public static void printArr(int arr[] , int idxx){
    System.out.println(arr[idxx]);
    if(idxx > arr.length){
      return;
    }
    printArr(arr, idxx+1);
  }
  
}