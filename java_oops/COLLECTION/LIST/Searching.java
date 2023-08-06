package java_oops.COLLECTION.LIST;

import java.util.ArrayList;
import java.util.Collections;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.SpringLayout.Constraints;

import java.*;
public class Searching {
    public static void main(String[] args) {
        
        ArrayList<E> a = new ArrayList();
        a.add(10);
        a.add(20);
       
        a.add(70);
        // to perform searching in a collection make sure that the data is sorted 
        int index = Collections.binarySearch(a, 20);
        System.out.println(a.get(index));

  
  






    }
}
