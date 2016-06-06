package builder;

public class JavaBuilder extends Builder{
	public JavaBuilder() {
		// TODO Auto-generated constructor stub
		super("java");
	}
	
	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.println(languae + "---System.out.println: hello, world");
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub
		System.out.println(languae + "---System.out.println: debuging...");
	}

}
