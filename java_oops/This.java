public class This {
  // this keyword which refers to current invocking object.
  // it cam be use to initilize the value 
  // we cant use this keyword in side of main() method
  // Also we can say that it is a holder that can hold the current object referance value or address 
   
  //------------------------------------------
  // program to use of this keyword
   void display(){
    System.out.println(this);
   }
   public static void main(String[] args) {
     This t = new This(); //This@7a81197d
     System.out.println(t);
   }
}
