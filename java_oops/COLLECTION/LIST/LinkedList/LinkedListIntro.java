package COLLECTION.LIST.LinkedList;
// in c++ linked list 
// public boolean remove(String data){
//     Node previous = head;
//     Node current = head.getNext();
//     while (current != null) {
//         String dataOld = current.getData();
//         if ((dataOld == null && data == null) || (dataOld != null && dataOld.equals(data))) {
//             Node afterRemoved = current.getNext();
//             previous.setNext(afterRemoved);
//             if (afterRemoved == null) { // i.e. removing last element
//                 last = previous;
//             }
//             size--;
//             return true;
//         } else {
//             previous = current;
//             current = current.getNext();
//         }
//     }
//     return false;
// }
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListIntro {
    
   
        
        public static void main(String[] args) {
            
    //	        LinkedList a  = new LinkedList();
    //	        a.add(10);
    //	        a.add("sauraj");
    //	        a.add(10);
    //	        a.add("kumari");
    //	        a.add(11);
    //	        a.add("somya");
    //	        a.add(12);
    //	        a.add("suraj");
    //	        a.add(13);
    //	        a.add("tiger");
    //	        a.add(14);
    //	        a.add("sam");
    //	        a.add(15);
    //	        a.add("alok");
               // System.out.println(a);
            
        // way to read contain fo collection 
    //	using itterator 
        
    //	Iterator itr = a.iterator();
    //	while(itr.hasNext()) {
    //		System.out.println(itr.next());
    //	}
    //	        a.remove(1);
    //	System.out.println(a.size());
    //	a.removeAll(a);
    //	System.out.println(a);
    //	System.out.println(a.size());
    //	
        //contains-->
       //System.out.print(a.contains(12));//true
            
            
            //-----------------------------------------------
            // Soring
            //when whenever binary search perform keep that it mind "THAT ELEMENT SHOUD BE SORTED "
       LinkedList a  = new LinkedList();
       a.add(101);
       a.add(110);
        a.add(1);
       a.add(12);
       a.add(131);
        a.add(135);
        Collections.sort(a);
        System.out.println(a);//[1, 12, 101, 110, 131, 135]
        //searching 
        int index  = Collections.binarySearch(a,110);
        System.out.println(index);//3
        System.out.println(a.get(index));//110
        
        
        
    
    }
    }
    
}
