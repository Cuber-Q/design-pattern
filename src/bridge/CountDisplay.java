package bridge;

public class CountDisplay extends Display{
	private int count = 3;
	public CountDisplay(DispalyImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 有点像模板方法模式
	 */
	public void multiDisplay(){
		rowOpen();
		for(int i=0;i<count;i++){
			rowPrint();
		}
		rowClose();
	}
}
