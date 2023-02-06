import java.io.*;

public class ReadWriteFile {
	
	public static void main(String s[]) throws IOException
	
	{
		BufferedWriter w = new BufferedWriter(new FileWriter("Output.txt"));
		w.write("Hello Moto");
		w.close(); //If I forget to call it, file will be created but nothing will be written
	}

}
