package java_oops.COLLECTION.LIST;
import java.util.ArrayList;
public class Arrylist {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add("mrinal");
        a.add(70.98);
        System.out.println(a); // print all the element in array
        // if i print a particular element of arrayList the we use like
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        //finding out size of collection 
        System.out.println(a.size());
        Collections.sort(a);
         System.out.println(a); 
        // a collection can we sorted only when there is homoginious data in it or else we will get Exception 
        //-----> Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
	//at java.base/java.lang.String.compareTo(String.java:140)


          // Constain is just check does element present or not 
        // if the element is present in it , it will return true Otherwise false

        System.out.println(a.contains(20));//true 
        System.out.println(a.contains(200));//false

        a.remove(1); // use to remove the element by givong that index number || it will be remove any one element 
        System.out.println(a);
        //clear --> it will remove all the element in the collection at one.

        

        a.clear();
        System.out.println(a);
// remove all--> it remove all the element , it very much like cleare , 
        //but memory will not delete but in clear momery will also be deleted 
        a.removeAll(a);
        System.out.println(a);
        //containsAll 
        ArrayList b = new ArrayList<>();
        b.add(2);
        b.add(34);
        b.add(23);

        ArrayList c = new ArrayList<>();
        c.add(12);
        c.add(43);
        c.add(65);

        System.out.println(b.containAll(c));
       }
}

