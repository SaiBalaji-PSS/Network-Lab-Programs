import java.util.*;
import java.net.*;
import java.io.*;

class Server
{
    static ServerSocket serversocket;
    static Socket socket;
    static Scanner scan;
    static DataOutputStream dout;
    static DataInputStream din;
    static String message;
    static String rmessage;

    public static void main(String []args)
    {
        try
        {
            serversocket=new ServerSocket(4000);
            socket=serversocket.accept();
            scan=new Scanner(System.in);
            dout=new DataOutputStream(socket.getOutputStream());
            din=new DataInputStream(socket.getInputStream());
            while(true)
            {
                
               
                
                 System.out.print("Enter the messsage: ");
                 message=scan.nextLine();
                 if(message.equalsIgnoreCase("bye"))
                 {
                     break;
                 }
                 dout.writeUTF(message);
                 rmessage=din.readUTF();
                System.out.print("Recived message: "+rmessage+"\n");
            }

            System.out.println("Connection closed");
            socket.close();


        }
        catch(Exception e)
        {
            System.out.println(" client has left the chat");
        }
       


    }
}