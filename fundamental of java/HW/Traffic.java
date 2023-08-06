package HW;
// 1)wajp on traffic signals
// Input :-
// Red
// Yellow
// Green
// Output:-
// Stop the vehicle
// Start but don't move

import java.util.Scanner;

public class Traffic {
    static void Light(String x){
    switch (x) {
        case "Green": System.out.println("GO"); break;
        case "Yello": System.out.println("Stert but don't move");break;
        case "Red": System.out.println("Stop the vehicle");break;
    
        default:System.out.println("enter valide input");
            break;
      }
    }
    public static void main(String[] args) {
        // String Yello;
        // String Green
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
         Traffic.Light(st);
    }
}