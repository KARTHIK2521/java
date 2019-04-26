import java.rmi.*;
import java.rmi.server.UnicastRemote;
public class idk extends UnicastRemoteObject implements Remote
{
  Arith()throws RemoteException
  {
	  super();
  }
  public double add(double x, double y)throws RemoteException
  {
	  return x+y;
  }
  
}
