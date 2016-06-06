package builder;

public class CppBuilder extends Builder{
	public CppBuilder() {
		// TODO Auto-generated constructor stub
		super("Cpp");
	}
	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.println(this.languae + "---cout << 'hello, world'");
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub
		System.out.println(this.languae + "---cout << 'debuging...'");
	}

}
