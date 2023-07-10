package abc;

public class Honda extends Bike{
	//@Override
	void mailage() {
		System.out.println("55km/lt");
	}
	@Override				// this is annotation 
	void speed() {
		System.out.println("40km/hr");
	}
}
