
package javanet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Wenjiezhang
 */
public class Rmiserver {

	public void send(Object object) throws IOException {

		ServerSocket server = new ServerSocket(8000);

		Socket s = server.accept();
		OutputStream out = s.getOutputStream();
		ObjectOutputStream oout = new ObjectOutputStream(out);
		
		oout.writeObject(object);
		oout.close();
		s.close();

	}

	public static void main(String args[]) {

		Rmiserver s = new Rmiserver();
		Demo d= new Demo("zwj","zwj");

		try {
			s.send(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
