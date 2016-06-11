package bridge;

public class SimpleDisplayImpl extends DispalyImpl{	
	private String str;
	
	public SimpleDisplayImpl(String s){
		this.str = s;
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
	}

	public void printLine(){
		System.out.println("|---------------|");
	}
	
	public void printStr(String s){
		System.out.println("|------"+s+"-----|");
	}
}
