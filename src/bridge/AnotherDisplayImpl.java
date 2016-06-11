package bridge;
/**
 * 另一个实现类，打印时的边界为＊和～
 * @author Cuber_Q
 *
 */
public class AnotherDisplayImpl extends DispalyImpl{
	private String str;
	private int width;
	
	public AnotherDisplayImpl(String s){
		this.str = s;
		this.width = s.getBytes().length;
	}
	
	@Override
	public void rowOpen() {
		// TODO Auto-generated method stub
		println();
	}

	@Override
	public void rowPrint() {
		// TODO Auto-generated method stub
		System.out.println("*"+str+"*");
	}

	@Override
	public void rowClose() {
		// TODO Auto-generated method stub
		println();
	}
	
	public void println(){
		System.out.print("*");
		for(int i=0;i<width;i++){
			System.out.print("~");
		}
		System.out.println("*");
	}

}
