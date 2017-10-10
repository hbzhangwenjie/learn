
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Wenjiezhang
 */
public class xServiceHander implements InvocationHandler {
	
	private Object tagert;
	public xServiceHander(Object tagert){
		this.tagert=tagert;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("执行之前");
		method.invoke(tagert, args);
		System.out.println("执行之后");

		return null;
	}

}
