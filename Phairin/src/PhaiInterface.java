import java.rmi.Remote;
import java.rmi.RemoteException;


public interface PhaiInterface extends Remote {
	public int WeightHeight (int x, int y) throws RemoteException;
	public int Height1 (int x, int y) throws RemoteException;
	public int Height2 (int x, int y) throws RemoteException;
	
}