import java.util.*;
import java.io.*;
import java.net.*;

class Server
{   static DataInputStream din;
    static String rmessage;
    static ServerSocket serverSocket;
    static DataOutputStream dout;
    static  Socket socket;

    public static void main(String []args)
    {
        try
        {
            serverSocket = new ServerSocket(4000);
            socket = serverSocket.accept();
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
            rmessage=din.readUTF();
            System.out.println("Message from client "+socket.getInetAddress());
            System.out.println(rmessage);
            dout.writeUTF(rmessage);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}