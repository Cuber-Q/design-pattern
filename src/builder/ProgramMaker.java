package builder;

/**
 * 包工头
 * @author Cuber_Q
 *
 */
public class ProgramMaker {
	private Builder builder;
	
	public ProgramMaker(Builder builder){
		this.builder = builder;
	}
	
	public void make(){
		this.builder.program();
		this.builder.debug();
	}
}
