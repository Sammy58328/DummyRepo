
public class StrictEfPee {
	
	public strictfp double sum()
    {
 
        double num1 = 10.999858;
        double num2 = 9.35;
        return (num1 + num2);
    }
 

    public static void main(String[] args)
    {

    	StrictEfPee t = new StrictEfPee();
    	//The strictfp keyword guarantees that results of all floating-point calculations are identical on all platforms.
        System.out.println(t.sum());
    }

}
