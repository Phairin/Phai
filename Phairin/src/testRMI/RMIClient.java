package testRMI;

import java.rmi.registry.*;

public class RMIClient {

		public static void main(String[] args) {
			try {
				Registry registry = LocateRegistry.getRegistry();
				RMIInterface stub = (RMIInterface) registry.lookup("RMIInterface");
				String response = stub.remoteMethod();
				System.out.println("response : " + response);
			} catch (Exception e) {
				System.err.println("Exception occur : " + e.toString());
			}
		}
}