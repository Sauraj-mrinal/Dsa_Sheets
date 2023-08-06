package JavaCodes.BasicJava;
//WAJP to read name and mibile number ,10th percentage ,12th percentage and degree percentage  and print 

import java.util.Scanner;

public class Q1 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter name ");
        String  str = scn.nextLine();
        System.out.println("enter monbile");
        long mob = scn.nextLong();
        System.out.println("enter 10th percentage ");
        int per_10th = scn.nextInt();
        System.out.println("enter 12th percentage ");
        int per_12th = scn.nextInt();
        System.out.println("enter degree percentage ");
        int per_degree = scn.nextInt();

        System.out.println("--------------------------");
        System.out.println( str);
        System.out.println(mob);
        System.out.println(per_10th);
        System.out.println(per_12th);
        System.out.println(per_degree);
        System.out.println("-----------------------------");
        
     }
}
