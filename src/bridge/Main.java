package bridge;

public class Main {
	public static void main(String[] args){
		//v0.0
		Display d1 = new Display(new SimpleDisplayImpl("hello, d1"));
		Display d2 = new CountDisplay(new SimpleDisplayImpl("hello, d2"));
		CountDisplay d3 = new CountDisplay(new SimpleDisplayImpl("hello ,d3"));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(3);
		
		//v0.1
		RandomDisplay r1 = new RandomDisplay(new SimpleDisplayImpl("hello, r1"));
		r1.randomDiplay(5);
		
		//v0.2
		Display d4 = new Display(new AnotherDisplayImpl("hello, d4"));
		d4.display();
	}
}
