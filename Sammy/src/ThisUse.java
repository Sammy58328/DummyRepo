
public class ThisUse {

	String name;
	int age;

	public ThisUse() {
		//System.out.println(name);    //Always have to be first statement inside constructor.
		this("Sammy", 50);   //This will invoke Constructor based on signature
	}

	public ThisUse(String name, int age) {
		this.name = name;
		this.age = age;      //As argument name & instant variable name are same, this.name represents variable name
	}
	
	public void babure() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		ThisUse tu = new ThisUse();
		tu.babure();
	}

}
