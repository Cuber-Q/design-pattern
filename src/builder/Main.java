package builder;

public class Main {
	public static void main(String[] args){
		ProgramMaker cppMaker = new ProgramMaker(new CppBuilder());
		ProgramMaker javaMaker = new ProgramMaker(new JavaBuilder());
		
		cppMaker.make();
		javaMaker.make();
		
	}
}
