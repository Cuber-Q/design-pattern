package bridge;

import java.util.Random;

/**
 * 扩展功能类，随机增加随机打印若干行数方法
 * 继承功能最接近的父类
 * @author Cuber_Q
 *
 */
public class RandomDisplay extends CountDisplay{

	public RandomDisplay(DispalyImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 扩展的功能方法，随机打印若干行
	 * 使用父类的［打印若干行］方法
	 * @param times
	 */
	public void randomDiplay(int times){
		multiDisplay(generateRandom(0,5));
	}
	
	private int generateRandom(int bottom, int top){
		int random = new Random().nextInt(top);
		if(random <= bottom){
			return generateRandom(bottom, top);
		}
		return random;
	}
}
