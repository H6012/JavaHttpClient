import java.io.*;
import java.net.*;

/* dpowell Java HTTP Get */

public class JavaHttpGetExample
{

  public static void main(String[] args)
  {
	int ch;
	
	try{
		
		String urlString = "http://178.62.29.184/db/_all_dbs";
		URL url = new URL(urlString);
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		
		StringBuilder sb = new StringBuilder();
		while((ch = is.read()) != -1)
			sb.append((char)ch);
		
		System.out.println(sb);
		
	}
	catch(Exception e){
		System.out.println("Exception " + e);
	}
  
  }
  
  
  
}