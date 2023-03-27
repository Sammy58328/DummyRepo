import java.io.*; 

public class Exceptional {   //Exception extends Throwable extends Object
	
	public static void main (String[] args) {
	      int a=5;
	      int b=0;
	        try{
	          System.out.println(a/b);
	        }
	        
	      catch(ArithmeticException | NumberFormatException e){  //Checked or Static Exception occurred during compile time like FileNotFoundException
	       System.out.println("Hello Second");
	    	  // e.printStackTrace();
	      }
	        
	        catch(Exception e){  //UnChecked or Runtime Exception occurred during Run time
		 	       System.out.println("Hello First");
		 	    	  // e.printStackTrace();
		 	       }
	        
	        finally
	        {
	        	System.out.println("Here I come");
	        }
	    }

}
