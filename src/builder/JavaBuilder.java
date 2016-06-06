package builder;

public class JavaBuilder implements Builder{

	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.println("System.out.println: hello, world");
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub
		System.out.println("System.out.println: debuging...");
	}

}
