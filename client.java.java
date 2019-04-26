import java.rmi.*;
class Client
{
	public static void main(String args[])throws Exception
	{
		double x,y;
		x=50.4,y=60.3;
		try
		{
			idk a=(idk)Naming.lookup("");
			System.out.println("Addition="+a.add(x,y));
		}
		catch(Exception)
		{
			
		}
	}	
}