	import java.rmi.RemoteException;
	import java.rmi.server.UnicastRemoteObject;


	public class PhaiInterfaceImpl extends UnicastRemoteObject implements PhaiInterface {
		
		private static final long serialVersionUID = 1L;
		public PhaiInterfaceImpl() throws RemoteException{
	}
		
		public int  WeightHeight(int Weight, int Height){
			int  result;
			result =  Weight/(Height*Height);
			return result;
		}


		public int Height1(int Height, int y){
			int  result;
			result =  Height-100;
			return result;
		}


		public int Height2(int Height, int y){
			//TODO Auto-generated method stub
			int  result;
			result =  Height-110;
			return result;
		}
		

	}
