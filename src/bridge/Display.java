package bridge;

public class Display {
	/**
	 * 连接功能层次(Display体系)和实现层次(DispalyImpl体系)的关键，
	 * 就是这个实现类的对象
	 */
	private DispalyImpl impl;
	
	public Display(DispalyImpl impl){
		this.impl = impl;
	}
	
	public void rowOpen(){
		impl.rowOpen();
	}
	public void rowPrint(){
		impl.rowPrint();
	}
	public void rowClose(){
		impl.rowClose();
	}
	public void display(){
		rowOpen();
		rowPrint();
		rowClose();
	}
}
