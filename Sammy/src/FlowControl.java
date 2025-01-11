



import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class FlowControl {

	public static void main(String[] args) {
	        
	   String arr[] = {"V","A","Z","P"};
	   
	   String key = "Z";
	   
	   System.out.println(Arrays.binarySearch(arr,key));
	  
       
       long number = 123L;
       
       double num = 12312312.343;
       
       NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
       String number_us = nf_us.format(number);
       String num_us = nf_us.format(num);
       
       NumberFormat nf_uk = NumberFormat.getInstance(Locale.UK);
       String number_uk = nf_uk.format(number);
       String num_uk = nf_uk.format(num); 
       
       System.out.println(number_us);
       System.out.println(number_uk);
        System.out.println(num_us);
               System.out.println(num_uk);

	}

}
