import java.net.*;

public class URLi {
	
	public static void main (String s[]) throws Exception
	{
		URL url =new URL("https://www.prostopleer.com"); //throws MalformedURLException
		HttpURLConnection huc= (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("GET");
		huc.connect();
		int i =huc.getResponseCode();
		
		if (i==200)
			System.out.println("Success");
		else
			System.out.println("Failure");
	}

}

//HTML DOM and CSSOM varies from browser to browser. HTML DOM and CSSOM combined forms Render tree.
