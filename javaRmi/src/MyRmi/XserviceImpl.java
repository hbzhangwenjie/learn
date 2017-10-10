
package MyRmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import MyRmi.Xservice;

/**
 * @author Wenjiezhang
 */
public class XserviceImpl extends UnicastRemoteObject implements Xservice {


	private static final long serialVersionUID = 1L;

	private String name;

	protected XserviceImpl(String name) throws RemoteException {

		this.name = name;

	}

	@Override
	public String echo(String str) throws RemoteException {

		// TODO Auto-generated method stub
		return name + str;
	}

	@Override
	public Date getTime() throws RemoteException {

		// TODO Auto-generated method stub
		return new Date();
	}

}
