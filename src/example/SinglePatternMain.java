package example;

public class SinglePatternMain {

	public static void main(String[] args){
		SingleObject object = SingleObject.getInstance();
		object = SingleObject.getInstance();
		object = SingleObject.getInstance();
		object = SingleObject.getInstance();
		object = SingleObject.getInstance();
		object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
