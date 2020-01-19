import java.net.*;
import java.io.*;
import java.util.*;

class Server2
{   
    static ServerSocket serversocket;
    static Scanner scan;
    static Socket socket;
    static   DataOutputStream dout;
    static  String message;
    public static void main(String[] args)
    {
        try
        {
            serversocket = new ServerSocket(1234);
            socket=serversocket.accept();
            scan = new Scanner(System.in);
            dout = new DataOutputStream(socket.getOutputStream());
          
           System.out.println("Enter the message to Client "+socket.getInetAddress());
           message=scan.nextLine();
           dout.writeUTF(message);
           
            serversocket.close();
        }
        catch(Exception e)
        {
            System.out.print(e.toString());
        }
       


    }
}