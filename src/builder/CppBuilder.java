package builder;

public class CppBuilder implements Builder{

	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.println("cout << 'hello, world'");
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub
		System.out.println("cout << 'debuging...'");
	}

}
