import java.util.*;
import java.net.*;
import java.io.*;

class Client
{
    
    static DataOutputStream dout;
    static DataInputStream din;
    static Socket socket;
    static Scanner scan;

    public static void main(String[] args)
    {
        try
        {
            socket = new Socket("localhost",1234);
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
            System.out.println("Message from server");
            String m = din.readUTF();
            System.out.println(m);
            dout.writeUTF(m);
            socket.close();
        }

        catch(Exception e)
        {
            System.out.println(e.toString());
        }
       
    }



}