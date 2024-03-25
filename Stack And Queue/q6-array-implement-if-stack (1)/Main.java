/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static class Stack{
        private int[] arr = new int[5]; 
        int idx=0;
        void push( int val){
            if( idx<arr.length){
                arr[idx++] = val;
            }
            else{
                System.out.println(" stack is full you cant insert the value ");
            }
        }
        int peek(){
            if(idx==0){
                System.out.println(" stack is empty");
                return -1;
            }
            return (arr[idx-1]);
        }
        int pop(){
            if( idx==0){
                System.out.println("Stack is an empty you can't retrive data");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx; i++){
                
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }
	public static void main(String[] args) {
	Stack st  = new Stack();
	// we are using here push method it is not a stl method
	// it is my own method because it call by my own creates stack object 
	st.push(4);
// 	st.display();
// 	System.out.println("size is "+st.size());
// 	st.push(5);
// 	st.display();
// 		System.out.println("size is "+st.size());
// 	st.push(1);
// 	st.display();
// 		System.out.println("size is "+st.size());
// 	st.push(9);
// 	st.display();
// 	System.out.println("size is "+st.size());
// 	st.pop();
	
// 	st.display();
// 	System.out.println("size is "+st.size());
	//st.pop();
	
	    st.display();
		System.out.println("size is "+st.size());
// 		st.push(4);
// 		st.push(4);
// 		st.push(4);
// 		st.push(4);
	}
}
