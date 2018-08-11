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

		SingleObjectInstanceMember secondObject = SingleObjectInstanceMember.INSTANCE;
		secondObject = SingleObjectInstanceMember.INSTANCE;
		secondObject = SingleObjectInstanceMember.INSTANCE;
		secondObject = SingleObjectInstanceMember.INSTANCE;
		SingleObjectInstanceMember.showMessage();
	}
}
