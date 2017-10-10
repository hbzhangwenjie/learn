
package MyRmi;

import javax.naming.Context;
import javax.naming.InitialContext;
import MyRmi.Xservice;
import MyRmi.XserviceImpl;


/**
 * @author Wenjiezhang
 */
public class RmiServer {

	public static void main(String[] args) {

		try {
			Xservice xs1 = new XserviceImpl("xs1");
			Context nameContext = new InitialContext();
			nameContext.bind("rmi:xservice", xs1);
			System.out.println("rigestry one Xservice");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
