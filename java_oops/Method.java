public class Method {
  // A method is collection of statement that use to perform some specfic task.
  // it can we return or without return to the caller.

  // return_type MethodName ( )
  // {
  // // Body of the Method / logic / implementation
  // return statement;
  // }
    int price =40;
    String color ="black";
    void write(){
      System.out.println("this is write method ::");

    }
    public static void main(String[] args) {
      System.out.println("Main method start");
      Method m1= new Method();
      m1.write();
      System.out.println("main method end ");
    }
  



}
