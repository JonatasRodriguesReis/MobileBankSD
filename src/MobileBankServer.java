import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.net.MalformedURLException;
import java.rmi.Naming;

public class MobileBankServer {
	public MobileBankServer() {
		try {
			LocateRegistry.createRegistry(1099);
			MobileBank m = new MobileBankImp();
			try {
				Naming.rebind("rmi://localhost:1099/MobileBankService", m);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MobileBankServer();
	}
}
