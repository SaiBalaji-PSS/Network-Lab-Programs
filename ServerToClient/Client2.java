import java.net.*;
import java.io.*;
import java.util.*;

class Client2{
	static Socket socket;
	static 	Scanner scan;
	static DataInputStream din;
	static String message;
	public static void main(String[] args)
	{
		
		try
		{
			socket = new Socket("localhost",1234);
			scan = new Scanner(System.in);
		    din = new DataInputStream(socket.getInputStream());
		
		    message = din.readUTF();
           System.out.println("Message From server "+message);
		   socket.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
			
		

	}
}