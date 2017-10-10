
package javanet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author Wenjiezhang
 */
public class Demo implements Serializable {

	private static final long serialVersionUID = 4745193645357895720L;

	private transient static int count=10;

	private transient static final int MAX = 1000;

	private String name;

	private transient String password="zzzz";

	static {

		System.out.println("静态初始化块");
	}

	public Demo() {

		System.out.println("无参构造方法");
		++count;
	}
	
	private void readObject(ObjectInputStream oin) throws IOException, ClassNotFoundException{
		oin.defaultReadObject();
		System.out.print("我来啦");
	}

	public Demo(String name, String password) {
		System.out.println("有参构造方法");
		this.name = name;
		this.password = password;
		++count;

	}

	public String toString() {

		return "count=" + count + " MAX" + MAX + " name" + name + " password" + password;

	}
}
