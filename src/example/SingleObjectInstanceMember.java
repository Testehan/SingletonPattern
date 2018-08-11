package example;

public class SingleObjectInstanceMember {

    private static int noOfInstances = 0;
    public static final SingleObjectInstanceMember INSTANCE = new SingleObjectInstanceMember();

    private SingleObjectInstanceMember(){
        noOfInstances++;
    }

    public static void showMessage(){
        System.out.println("Number of instances : " + noOfInstances);
    }
}
