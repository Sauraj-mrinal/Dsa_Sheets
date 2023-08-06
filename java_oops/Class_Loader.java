import java.net.SocketPermission;
import java.util.*;
public class Class_Loader {
  

  int age;
  String name ;
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
  System.out.println("enter a number");
  int p = scn.nextInt();
    Class_Loader c = new Class_Loader();
    c.age=24;
    c.name = "Mrinal";
    System.out.println(c.age);
    System.out.println(c.name);
    System.out.println(p);
    
  }
  
}
// class loading is process to load .class file from hard disk to JVM Memory.
