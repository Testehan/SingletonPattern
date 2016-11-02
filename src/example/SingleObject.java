package example;

public class SingleObject {

	private static SingleObject singleObject;
	private static int noOfInstances = 0;
	
	private SingleObject(){}
	
	static {
		singleObject = new SingleObject();
		noOfInstances++;
	}
	
	public static SingleObject getInstance(){
		return singleObject;
	}
	
	public void showMessage(){
	      System.out.println("Number of instances " + noOfInstances);
	}
}
