import java.util.*;

public class  Serching{


    public static void main(String[] args){

  Scanner scn = new Scanner(System.in);
  System.out.println("Enter Size of Array");
  int n = scn.nextInt();

  int arr[]= new int[n];

  // int n1 = scn.nextInt();
  //       int a1[] = new int[n1];
  for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();

        }
  System.out.println("Enter element ");
  int k = scn.nextInt();

           short(arr);
           Binary_search(arr , k);
          
}

 public static void short(int[] a){
   int size = a.length;
   
   for (int i = 0; i < a.length; i++){
          int temp = a[i];
          for(int j=i+1;j<a.length;j++){

            if(temp> a[j]){
              int t = a[j];
              a[j]= temp;
              temp = t;
            }
          }
   }

 }
 public static void  Binary_search(int arr[] , k){
           int st=0;
           int end = arr.length;
           while(st<=end){
             int midd = (st+ end)/2;
             if(arr[mid]>k ){
               st = midd+1;
             }
             else if(arr[mid] < k ){
               end = midd - 1;
             }
             else{
               return midd;
             }
             return -1;
           }
 }

}
