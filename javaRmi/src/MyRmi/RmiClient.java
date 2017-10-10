
package MyRmi;

import javax.naming.Context;
import javax.naming.InitialContext;
import MyRmi.Xservice;


/**
 * @author Wenjiezhang
 */
public class RmiClient {

	public static void main(String[] args) {

		try {
			Context nameContext = new InitialContext();
			Xservice xs = (Xservice) nameContext.lookup("rmi:xservice");
			System.out.println(xs.echo("client"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
