import java.text.DecimalFormat;

public class Start {
	
	public static void main (String s[])throws Exception
	
	{
		String a = "4";
		float b = Float.valueOf(a);
		double weight = 3.0 * b * 0.75;
		DecimalFormat df = new DecimalFormat("#.000");
		String as = df.format(weight);
		System.out.println(as);
		int weigInt = (int) (weight * 1000);
		 	
		//Starty sm=new Starty();
//		double weight = 2.55;
		
//		int properWeight = (int) (weight*100);
//		//String weightedUPC = Integer.toString(properWeight);
//		String formattedweightUPC = String.format("%05d", properWeight);
//		System.out.println(formattedweightUPC);
//		
//		
//		Class sc = Class.forName("Starty");
//		Starty sm= (Starty)sc.newInstance();
//		sm.meta();		
	}
}

