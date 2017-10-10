package proxy;

import java.lang.reflect.Proxy;



/**
 * @author Wenjiezhang
 */
public class xServiceProxy {

public static void  main(String args[]){
	
	xServiceImpl x = new xServiceImpl();
	xServiceHander xh= new xServiceHander(x);
	xService xx = (xService)Proxy.newProxyInstance(x.getClass().getClassLoader(), x.getClass().getInterfaces(), xh);
	xx.busness();
}

}
