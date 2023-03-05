
class Animal{
	public void kebab() {
		
		System.out.println("Hi Kebab");
	}	
}

public class InheriExm extends Animal{
	
	public void rezala() {
		System.out.println("Hi Rezala");		
	}
	
public void kebab() {		
		System.out.println("Hi Inside Kebab");
	}
	

	public static void main(String[] args) {

		Animal a = new InheriExm(); // Won't recognize rezala() method
		a.kebab();
		
		Animal c= new Animal();
		c.kebab();
		
		InheriExm b = new InheriExm();
		b.kebab();
		b.rezala();
	}

}
