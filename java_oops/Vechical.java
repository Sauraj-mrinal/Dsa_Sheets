
class car extends Vechical{
	public car() {
		this("black");
	}
	public car (String clr) {
		this(12342);
		
	}
	public car( int price) {
		super();
	}
	public static void main(String[] args) {
		Car c = new Car();
	}
}


public class Vechical {

	public Vechical() {
		System.out.println("vehicle()");
	}
	

}
