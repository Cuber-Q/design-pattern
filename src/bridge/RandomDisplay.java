package bridge;

import java.util.Random;

public class RandomDisplay extends Display{

	public RandomDisplay(DispalyImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void randomDiplay(int times){
		rowOpen();
		for(int i=0;i<generateRandom(0, times);i++){
			rowPrint();
		}
		rowClose();
	}
	
	private int generateRandom(int bottom, int top){
		int random = new Random().nextInt(top);
		if(random <= bottom){
			return generateRandom(bottom, top);
		}
		return random;
	}
}
