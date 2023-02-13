public class StaticClass {
	
	int i;
	
	public static class InnerClassy{
	//We cannot use the static keyword with a class unless it is an inner class	
		int j;
	}

	public static void main(String[] args) {
		
		StaticClass sc = new StaticClass();		
		sc.i=5;
		
		StaticClass.InnerClassy ic = new StaticClass.InnerClassy();  
		//It can be accessed without instantiating the outer class, using other static members.		
		
		ic.j=6;
		
		System.out.println(sc.i);
		System.out.println(ic.j);

	}

}
