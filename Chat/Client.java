import java.util.*;
import java.net.*;
import java.io.*;

class Client
{
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
            socket=new Socket("localhost",4000);
            scan=new Scanner(System.in);
            dout=new DataOutputStream(socket.getOutputStream());
            din=new DataInputStream(socket.getInputStream());
            System.out.println("Waiting for server to join the chat");
            while(true)
            {
               
               
                rmessage=din.readUTF();
                System.out.print("Recived message: "+rmessage+"\n");
                 System.out.print("Enter the messsage: ");
                 message=scan.nextLine();
                 if(message.equalsIgnoreCase("bye"))
                 {
                     break;
                 }
                 dout.writeUTF(message);
                
            }

            System.out.println("Connection closed");
            socket.close();


        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
       


    }
}