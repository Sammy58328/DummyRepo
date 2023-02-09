import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ //Try with resource
	
	int i= Integer.parseInt(br.readLine());
	
	System.out.println(i); 
	
	//No need of br.close()
	
}

	}

}
