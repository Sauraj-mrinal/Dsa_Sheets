// //day 11
//basic operation of ArrayList
//..........ArrayList is 
//liner 
//continuous 
//continuous
//dynamic 

import java.util.*;
public class List {
 // 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> list = new ArrayList<Integer>();
     System.out.println(list+ " "+list.size());
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);
     list.add(60);
     list.add(70);
     list.add(80);// add in end
//     System.out.println(list+" "+list.size());
//     for(int i=0; i<list.size(); i++) {
//    	 System.out.print(" "+list.get(i));
//     }
//     System.out.println("------------------------");
//     // print using foreach loop
//     
//     for(int v1 : list) {
//    	 System.out.println(v1);
//     }
//     System.out.println("------------------------");
//     // for remove the element
//     int rele = list.remove(0);
//     System.out.println("removed element "+rele+ "updated list "+list);
     System.out.println("------------------------");
     
     System.out.println(list);
     list.add(3,200); 
     // add at specific index 
     //here 3 is index and value =200;
     System.out.println(list);
     
     
     
     
     
	}

}
