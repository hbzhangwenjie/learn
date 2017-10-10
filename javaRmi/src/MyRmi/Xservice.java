
package MyRmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * @author Wenjiezhang
 */
public interface Xservice extends Remote {

	public String echo(String name) throws RemoteException;

	public Date getTime() throws RemoteException;

}
