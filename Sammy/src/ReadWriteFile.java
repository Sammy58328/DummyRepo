import java.io.*;

public class ReadWriteFile {
	
	public static void main(String s[]) throws IOException
	
	{
		BufferedWriter w = new BufferedWriter(new FileWriter("Output.txt"));
		w.write("Hello Moto");
		w.write("\n This is funny");
		w.close(); //If I forget to call it, file will be created but nothing will be written
		
		BufferedReader r= new BufferedReader(new FileReader("Output.txt"));
		//System.out.println(r.readLine()); //Will only read first line
	
		String line;
		while((line =r.readLine())!=null) {
		System.out.println(line);
		}
		r.close();
	}

}
