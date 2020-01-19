import java.net.*;
import java.io.*;
import java.util.*;

class Client{
static Socket socket;
static Scanner scan;
static DataOutputStream dout;
static String message;
	public static void main(String[] args)
	{
		
		try
		{
		   socket = new Socket("localhost",1234);
		   scan = new Scanner(System.in);
		   dout = new DataOutputStream(socket.getOutputStream());
		   System.out.println("Enter the message to server");
		   message = scan.nextLine();
		   dout.writeUTF(message);
		   socket.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
			
		

	}
}