package JavaCodes.BasicJava;
// Q26. Write a java program to print ASCII values of the characters from A to Z and a to z and 0 to 9?

// Input: 9
// Output:

// 65 66 67......90

// 97 98 99......122

// 48 49....57
public class Q26 {
    public static void main(String[] args) {
        char ascCh;
        for( ascCh='A'; ascCh<='Z'; ascCh++){
            System.out.print(" "+ascCh+"="+(int)ascCh);
        }
        System.out.println();
        char ch;
        for(ch = 'a';ch<='z';ch++) {
            System.out.print(" "+ch+"="+(int)ch);
        }
        System.out.println();
        char c;
        for(c='0'; c<'9';c++) {
            System.out.print(" "+c+"="+(int)c);
        }
    }
    }
    