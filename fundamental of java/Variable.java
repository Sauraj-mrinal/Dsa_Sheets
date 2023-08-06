// WE HAVE TWO TYPE IF VARIABLE 
//  LOCAL AND GLOABLE 

//  HERE WE ARE SEING VARIABLE SHADOING 
public class test1{

  int age =10;
  void display(){
    int age =12;
    System.out.println("test1.display()"+age);
    System.out.println("display 1"+this.age);
  }
  void display1(){
    System.out.println("test1.display1()"+age);
  }
  public static void main(String[] args) {
    test1 t1 = new test1();
    t1.display();
    t1.display1();
  }
}