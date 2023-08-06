
public class C extends A {
  C(){
	  System.out.println("this is c");
  }
  C(int i){
	  this ();
	  super ();
	  // we cant use this as well as super at same time 
	  // bcz compiler will get confused which one will execute first
	  // this or super 
  }
}
