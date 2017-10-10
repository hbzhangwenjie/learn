
package Reflection;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Wenjiezhang
 */
public class RpcServer {

	public void server() throws Exception {

		ServerSocket sSocket = new ServerSocket(8000);
		System.out.println("服务启动");
		while (true) {
			Socket socket = sSocket.accept();
			InputStream in = socket.getInputStream();
			ObjectInputStream oin = new ObjectInputStream(in);
			System.out.println("接收到客户请求");
			OutputStream out = socket.getOutputStream();
			ObjectOutputStream oot = new ObjectOutputStream(out);
			CallDto call = (CallDto) oin.readObject();
			System.out.println("获取客户端数据请求类名" + call.getClassName());
			call = exe(call);
			System.out.println("执行完成结果" + call.getResult());
			System.out.println("返回结果" + call.getResult());
			oot.writeObject(call);
			socket.close();
			oin.close();
			oot.close();
			in.close();
			out.close();
		}

	}

	@SuppressWarnings("rawtypes")
	public CallDto exe(CallDto call) throws Exception {

		Object[] paramValues = call.getParamValues();
		Class[] paramTypes = call.getParamType();
		Class<?> classType = Class.forName(call.getClassName());
		Object service = classType.newInstance();
		Method method = classType.getMethod(call.getMethodName(), paramTypes);
		Object result = method.invoke(service, paramValues);
		call.setResult(result);
		return call;

	}

	public static void main(String arg[]) throws Exception {

		RpcServer s = new RpcServer();
		s.server();
	}

}
