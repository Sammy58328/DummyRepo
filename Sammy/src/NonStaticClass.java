
public class NonStaticClass {
	
	int i;
	
	public class InnerClass{
		
		int j;
	}

	public static void main(String[] args) {
		
		NonStaticClass ns = new NonStaticClass();		
		ns.i=5;
		
		NonStaticClass.InnerClass ic = ns.new InnerClass();		
		ic.j=6;
		
		System.out.println(ns.i);
		System.out.println(ic.j);
				
	}
}
