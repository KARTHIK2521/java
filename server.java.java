import java.rmi.*;
class Server
{
	public static void main(string args[])throws Exception
	{
		try
		{
			idk ajp = new idk();
			Naming.bind("");
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
		}
	}
}