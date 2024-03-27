/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{   public static class Node{
    int val;
    Node next;
    Node( int x){
        this.val= x;
    }
    
}
public static class LLStack{// user define data structure 
   Node head = null;
   int size =0;
   void push(int x){
       Node temp = new Node(x);
       temp.next = head;
       head = temp;
       size++;
   }
   void dispalayrec(Node h){
       if(h==null){
           return;
       }
       dispalayrec(h.next);
       System.out.print(h.val+" ");
   }
   void display(){
       dispalayrec(head);
       System.out.println();
   }
 void displayRev(){
     Node temp = head;
     while( head !=null){
         System.out.print(temp.val+" ");
         temp = temp.next;
         
     }
     System.out.println();
 }  
  int pop(){
      if( head==null){
          System.out.println(" Stack is empty");
          return -1;
      }
      int x = head.val;
      head  = head.next;
      return x;
  }
  
  int peek(){
      if( head==null){
          System.out.println(" Stack is empty");
          return -1;
      }
      int x = head.val;// we Are only return the value of head 
      return x;
  }
  int Size(){
      return size;
  }
  boolean isEmpty(){
      if( head == null ){
         return true;
      }
      else{
          return false;
      }
  }
  
  
}
	public static void main(String[] args) {
	     LLStack st = new LLStack();
	     st.push(10);
	 //st.display();
	System.out.println("size is "+st.Size());
	st.push(20);
	st.display();
		System.out.println("size is "+st.Size());
	st.push(30);
	st.display();
		System.out.println("size is "+st.Size());
	st.push(40);
	st.display();
	System.out.println("size is "+st.Size());
	st.pop();
	System.out.println(st.peek());
	}
}
