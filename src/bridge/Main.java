package bridge;

public class Main {
	public static void main(String[] args){
		Display d1 = new Display(new SimpleDisplayImpl("hello, d1"));
		Display d2 = new CountDisplay(new SimpleDisplayImpl("hello, d2"));
		CountDisplay d3 = new CountDisplay(new SimpleDisplayImpl("hello ,d3"));
		
		d1.display();
		d2.display();
		d3.display();
		
		d3.multiDisplay();
		
		RandomDisplay r1 = new RandomDisplay(new SimpleDisplayImpl("hello, r1"));
		r1.randomDiplay(5);
	}
}
