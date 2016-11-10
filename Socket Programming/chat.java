import java.net.*;
import java.io.*;
class chat 
{
	ServerSocket ss;
	DataInputStream dis;
	DataInputStream sdis;
	DataOutputStream dos;

	Socket s1;
	String d;
	String wd;
	public chat()
	{
		try
		{
			ss=new ServerSocket(2011,1,getAddress("192.168.1.117"));
			s1=ss.accept();
			System.out.println("Request accepted");
			dis=new DataInputStream(s1.getInputStream());
			sdis=new DataInputStream(System.in);
			dos=new DataOutputStream(s1.getOutputStream());
			while(true)
			{
				d=dis.readUTF();
				System.out.println(d);
				wd=sdis.readLine();
				dos.writeUTF(wd);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) 
	{
	chat c=new chat();
		//System.out.println("Hello World!");
	}
}
