

public class MethodAccess {

	public static void main(String[] args) {		
		myMethod();
	}
	
	public static void myMethod() {
		System.out.println("myMethod");
		myMethod();
		
		//Exception in thread "main" java.lang.StackOverflowError
		}
}
