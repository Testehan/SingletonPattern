package example;

public class SinglePatternMain {

	public static void main(String[] args){
		SingleObjectStaticBlock object = SingleObjectStaticBlock.getInstance();
		object = SingleObjectStaticBlock.getInstance();
		object = SingleObjectStaticBlock.getInstance();
		object = SingleObjectStaticBlock.getInstance();
		object = SingleObjectStaticBlock.getInstance();
		object = SingleObjectStaticBlock.getInstance();
		
		object.showMessage();
	}
}
