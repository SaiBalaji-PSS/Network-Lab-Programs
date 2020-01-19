import java.net.*;
import java.io.*;
import java.util.*;

class Server
{   
    static ServerSocket serversocket;
    static Socket socket;
    static DataInputStream din;
    static String rmessage;
    public static void main(String[] args)
    {
        try
        {
            serversocket = new ServerSocket(1234);
            socket=serversocket.accept();
            din = new DataInputStream(socket.getInputStream());
            rmessage = din.readUTF();
            System.out.println("Message from Client "+socket.getInetAddress());
            System.out.println(rmessage);
            serversocket.close();
        }
        catch(Exception e)
        {
            System.out.print(e.toString());
        }
       


    }
}