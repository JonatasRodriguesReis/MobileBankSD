import java.net.MalformedURLException;
import java.rmi.*;
public class MoileBankClient {
	public static void main(String[] args) {
		try {
			MobileBank m = (MobileBank) Naming.lookup("//127.0.0.1:1099/MobileBankService");
			System.out.println("O saldo Atual e : " + m.consultar("qualquer"));
			System.out.println(" ");
			System.out.println("Saldo Atual e : " + m.depositar("nada", 5600));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
