import java.net.*;
import java.io.*;
class chatclient
{
	Socket s;
	DataInputStream dis;
    DataInputStream cldis;
	DataOutputStream dos;
	String d;
    String wd;

	public chatclient()
    {
		try
		{
		   s=new Socket("192.168.1.117",2011);
           System.out.println("Request Sent");
		   dos=new DataOutputStream(s.getOutputStream());
		   dis=new DataInputStream(System.in);
		   cldis=new DataInputStream(s.getInputStream());
		while(true)
			{
		    d=dis.readLine();
			dos.writeUTF(d);
			wd= cldis.readUTF();
			System.out.println(wd);
		
		
		
		 }
		
		
		}
		catch (Exception e)
		{
 e.printStackTrace();
		
		}
	}
public static void  main(String args[])
		{
      chatclient mc=new chatclient();
      }
}