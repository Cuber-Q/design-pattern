package bridge;
/**
 * 功能类的基类
 * @author Cuber_Q
 *
 */
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
	
	/**
	 * 一个具体的功能方法
	 */
	public void display(){
		rowOpen();
		rowPrint();
		rowClose();
	}
}
