
import java.rmi.*;
public interface MobileBank extends Remote{
	public double consultar (String nomeCliente) throws RemoteException;
	public double depositar (String nomeCliente,double valor) throws RemoteException;
}
