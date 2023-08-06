package JavaCodes.BasicJava.Class_work.PATTERNS;

    public class Q28 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int star = 1;
                int space =n/2;
                for( int i=1; i<=n; i++){
    
                    // space 
                    for( int csp=1; csp<=space;csp++){
                        System.out.print(" ");
    
                    }
                    // star
    //	            char x ='A';
                    int x=1;
                    for(int cst = 1; cst<=star; cst++){
                        System.out.print(x);
                        
                        if(cst<=star/2) {
                            x++;
                        }else {
                            x--;
                        }
                    }
                    
                    System.out.println();
    
                    if(i<=n/2){
                        space = space-1;
                        star=star+2;
                    }else{
                       space =space+1;
                       star = star-2; 
                    }
                }
           } 
    }

