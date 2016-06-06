package builder;

/**
 * 定义一个抽象码农
 * @author Cuber_Q
 *
 */
public abstract class Builder {
	public String languae; 
	public abstract void program();
	public abstract void debug();
	
	public Builder(){
		this.languae = "";
	}
	public Builder(String language){
		this.languae = language;
	}

}
