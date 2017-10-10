
package Reflection;

import java.lang.reflect.Method;

/**
 * @author Wenjiezhang
 */
public class DumpMethod {

	public static void main(String[] args) throws ClassNotFoundException {

		Class cla = Class.forName("java.util.Stack");
		Method methods[] = cla.getDeclaredMethods();
		for(int i=0 ;i<methods.length;i++){
			System.out.println(methods[i].toGenericString());
		}
		
	}

}
