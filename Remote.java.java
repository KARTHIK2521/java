import java.rmi.*;
public interface Remote extends Remote
{
	public double add(double x,double y) throws RemoteException;
}
