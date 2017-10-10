
package javanet;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author Wenjiezhang
 */
public class RmiClent {

	public void recive() throws Exception {

		Socket socket = new Socket("127.0.0.1", 8000);
		InputStream in = socket.getInputStream();
		ObjectInputStream oin = new ObjectInputStream(in);
		Object o = oin.readObject();
		System.out.println(o);
		oin.close();
		in.close();

	}

	public static void main(String args[]) {

		RmiClent c = new RmiClent();
		try {
			c.recive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
