import java.util.Random;

public class Randomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Randomm r = new Randomm();
		
		System.out.println(r.randomBig());
	}
	
	public String randomBig() {
		
		double weight = 2.55;
		
		int properWeight = (int) (weight*100);
		String weightedUPC = Integer.toString(properWeight);
		String formattedweightUPC = String.format("%05d", weightedUPC);
		return formattedweightUPC;

//		Random rand = new Random();
//		long numbers = rand.nextInt(1000000000)               
//	             + (rand.nextInt(90) + 10) * 1000000000L; 
//		
//		String str = "999"+ numbers;
//		
//		return str;
		
		
	}

}
