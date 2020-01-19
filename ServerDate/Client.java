import java.util.*;
import java.net.*;
import java.io.*;

class Client
{
    static DataInputStream din;
    static Socket socket;
    
    public static void main(String[] args)
    {
        try
        {
             socket = new Socket("localhost",4000);
             din = new DataInputStream(socket.getInputStream());
           
             System.out.println("Message from server");
             String rmessage = din.readUTF();
             System.out.println(rmessage);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}