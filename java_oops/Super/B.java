
public class B extends A {
	B(int i){
		System.out.println("this is arg const"+i);
	}
    B(){
     
    	System.out.println("this is B");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b1 = new B();
     new B(200);
	}

}
