import java.util.*;
import java.net.*;
import java.io.*;

class Server
{
    static ServerSocket serversocket;
    static DataOutputStream dout;
    static DataInputStream din;
    static Socket socket;
    static Scanner scan;

    public static void main(String[] args)
    {
        try
        {
            serversocket = new ServerSocket(1234);
            socket=serversocket.accept();
            scan=new Scanner(System.in);
            dout=new DataOutputStream(socket.getOutputStream());
            din=new DataInputStream(socket.getInputStream());
            
            System.out.println("Enter the message to client");
            String message=scan.next();
            dout.writeUTF(message);
            System.out.println("Echoed message");
            System.out.println(din.readUTF());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        

    }
}