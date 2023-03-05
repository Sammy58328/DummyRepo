class Bunty{
	
	public Bunty() {
		System.out.println("Bunty, sabun slow hai kya?");
	}
	
	public void remo() {
		System.out.println("Ye Remo D'Souza hai kya?");
	}
}

public class SuperUse extends Bunty{
	
	public SuperUse() {
		super();
		System.out.println("Hi Lifebuoy");
		
	}
	
	public void remo() {		
		System.out.println("Asli Remo D'Souza");
		super.remo();
	}

	public static void main(String[] args) {
		
		Bunty su = new SuperUse();		
		su.remo();
	}

}
