
public class Start {
	
	public static void main (String s[])throws Exception
	
	{
		//Start sm=new Start();
		
		
		Class sc = Class.forName("Start");
		Start sm= (Start)sc.newInstance();
		//Dynamic class loading		
		
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}

