import java.net.*;
import java.util.*;
import java.io.*;

class Client
{   static Socket socket;
    static DataOutputStream dout;
    static DataInputStream din;
   static Scanner scan;
    static String emessage;
    public static void main (String []args)
    {  try
        {
            socket = new Socket("localhost",4000);
            dout = new DataOutputStream(socket.getOutputStream());
            din = new DataInputStream(socket.getInputStream());
            scan = new Scanner(System.in);
            System.out.println("Enter the message to server");
            String m = scan.next();
            dout.writeUTF(m);
            emessage=din.readUTF();
            System.out.println("Echoed message is "+emessage);
            
    
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
       

    }
}