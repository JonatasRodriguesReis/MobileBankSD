import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MobileBankImp extends UnicastRemoteObject implements MobileBank{
	
	private double saldo;
	
	protected MobileBankImp() throws RemoteException {
		super();
		this.saldo = 0;
	}

	@Override
	public double consultar(String nomeCliente) throws RemoteException {
		return this.saldo;
	}
	
	@Override
	public double depositar(String nomeCliente,double valor) throws RemoteException {
		this.saldo += valor;
		return this.saldo;
	}

}
