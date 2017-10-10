
package Reflection;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Wenjiezhang
 */
public class RPCClient {

	public void exe() throws Exception {

		Socket s = new Socket("localhost", 8000);
		OutputStream out = s.getOutputStream();
		ObjectOutputStream oot = new ObjectOutputStream(out);		
		oot.writeObject(new CallDto("Reflection.SimpleServiceImpl", "echo", new Class[]{String.class}, new Object[]{"zej,hello"}));		
		InputStream in = s.getInputStream();
		ObjectInputStream oin = new ObjectInputStream(in);
		CallDto call = (CallDto) oin.readObject();		
		System.out.println((String) call.getResult());
		s.close();
		oot.close();
		out.close();
		oin.close();
		in.close();
	}

	public static void main(String[] args) throws Exception {

		new RPCClient().exe();
	}
}
