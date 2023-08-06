import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n== 0){
            ArrayList<String> base = new ArrayList<>();
             base.add("");
        }
        ArrayList<String> myList = new ArrayList<>();
         if(n >=1){//1 len
         ArrayList<String> paths = getStairPaths(n-1);
         for(String path : paths){
             myList.add(1+path);
         }
        }
         if(n >=2){//2 len
         ArrayList<String> paths = getStairPaths(n-2);
         for(String path : paths){
             myList.add(2+path);
         }
          }
          if(n >=3){//3 len
         ArrayList<String> paths = getStairPaths(n-3);
         for(String path : paths){
             myList.add(3+path);
         }
          }

  return myList;


}