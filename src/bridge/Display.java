package bridge;

public class Display {
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
