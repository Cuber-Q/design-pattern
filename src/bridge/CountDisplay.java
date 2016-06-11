package bridge;
/**
 * 扩展的功能类，新增多条打印方法
 * @author Cuber_Q
 *
 */
public class CountDisplay extends Display{
	public CountDisplay(DispalyImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 扩展的功能方法，打印若干行
	 */
	public void multiDisplay(int times){
		rowOpen();
		for(int i=0;i<times;i++){
			rowPrint();
		}
		rowClose();
	}
}
