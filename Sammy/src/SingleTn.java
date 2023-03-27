import java.util.Calendar;

public class SingleTn {

	public static void main(String[] args) {
		
		Abacus obj =  Abacus.getInstance();
		obj.messy();
	}

}

class Abacus {

	private static Abacus a = new Abacus();			//Declare object as static

	private Abacus() {						//Create Private Constructor
		System.out.println("Private Constructor");
	}

	public static Abacus getInstance() {	//Create method to access the object	
		return a;							//Return type is class name "Abacus"
	}

	void messy() {
		System.out.println("Hi Messi");
	}
}

