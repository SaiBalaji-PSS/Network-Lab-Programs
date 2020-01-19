import java.util.*;
import java.io.*;
import java.net.*;

class Server
{
    static DataOutputStream dout;
    static ServerSocket serversocket;
    static Socket s;
    static Date d;

    public static void main(String[] args)
    {
        try
        {
            serversocket = new ServerSocket(4000);
            s=serversocket.accept();
            dout=new DataOutputStream(s.getOutputStream());
            
            d=new Date();
            System.out.println("Sending message to client "+s.getInetAddress());
            dout.writeUTF("DATE IS:"+d.toString());
            //serversocket.close();

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        
    
    }
}