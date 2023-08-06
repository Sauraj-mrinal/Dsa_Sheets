package JavaCodes.BasicJava.Class_work.Array_basic;
// Q22. write a java program to define a method to combine 2 array elements into single array.

// Explanation: you have to merge both the array into one single array.

// Ex: I/P array 1[12,34,56]

// array 2[36,98,76]

// O/P [12,34,56,36,98,76]
public class Q22 {

    static void CmobineTWO_aRRAY(int []a,int []b){
        int s1 = a.length;
        int s2 = a.length;
        int size =s1+s2;
        int []arr = new int [size];
        int i=0;
        for(i=0;i<a.length; i++){
            arr[i]=a[i];
        }
        for(int j=i+1;j<b.length; j++){
            arr[j]=a[j];
        }
        for( int t=0; t<arr.length;t++){
            System.out.print(" "+arr[t]);
        }
       
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int []arr1 = new int[n];
        int []arr2 = new int[n];
        for( int i=0; i<n1; i++){
            arr1[i]=scn.nextInt();

        }
        for( int i=0; i<n2; i++){
            arr2[i]=scn.nextInt();

        }
        CmobineTWO_aRRAY(arr1, arr2);
    }
}
