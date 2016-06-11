package bridge;

public class SimpleDisplayImpl extends DispalyImpl{	
	private String str;
	private int width;
	
	public SimpleDisplayImpl(String s){
		this.str = s;
		this.width = s.getBytes().length;
	}
	
	@Override
	public void rowOpen() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void rowPrint() {
		// TODO Auto-generated method stub
		printStr(this.str);
	}

	@Override
	public void rowClose() {
		// TODO Auto-generated method stub
		printLine();
		System.out.println();
	}

	public void printLine(){
		System.out.print("+");
		for(int i=0;i<width;i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public void printStr(String s){
		System.out.println("|"+s+"|");
	}
}
