import java.rmi.Naming;

public class PhaiServer {
	
	public static void main(String args[]){
		
		try{
			PhaiInterface obj = new PhaiInterfaceImpl();
			Naming.rebind("//192.168.134.94:1099/RMIServer",obj);
			System.out.println("Waiting client...");
			}
		
		catch(Exception e){
			
			System.out.println(e);
		}
	}
}
