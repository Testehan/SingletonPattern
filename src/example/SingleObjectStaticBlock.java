package example;

public class SingleObjectStaticBlock {

	private static SingleObjectStaticBlock singleObject;
	private static int noOfInstances = 0;
	
	private SingleObjectStaticBlock(){}
	
	static {
		singleObject = new SingleObjectStaticBlock();
		noOfInstances++;
	}
	
	public static SingleObjectStaticBlock getInstance(){
		return singleObject;
	}
	
	public void showMessage(){
	      System.out.println("Number of instances " + noOfInstances);
	}
}
