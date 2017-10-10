
package Reflection;

import java.util.Date;

/**
 * @author Wenjiezhang
 */
public class SimpleServiceImpl implements SimpleService {

	@Override
	public String echo(String str) {

		return "echo" + str;
	}

	@Override
	public Date getTime() {

		return new Date();
	}

}
