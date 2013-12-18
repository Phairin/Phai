import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class PhaiClient {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		try{
			PhaiInterface obj = (PhaiInterface)Naming.lookup("//localhost:1099/RMIServer");			
			int BMI = obj.WeightHeight(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			int BMI1 = obj.Height1(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
			int BMI2 = obj.Height2(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
			
			System.out.println("Weight Height = "+args[0]+" height = "+args[1]+" is "+BMI);
			System.out.println("Height1 = "+args[2]+" height = "+args[3]+" is "+BMI1);
			System.out.println("Height2 = "+args[4]+" height = "+args[5]+" is "+BMI2);
			}
		
		catch(Exception e){
			
			System.out.println("Have Error!!!");		
		}
	

	}
}