
package Reflection;

import java.io.Serializable;

/**
 * @author Wenjiezhang
 */
public class CallDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String className;

	private String methodName;

	private Class paramType[];

	private Object paramValues[];

	private Object result;

	public CallDto() {

	}

	public CallDto(String className, String methodName, Class[] paramType, Object[] paramValues) {

		this.className = className;
		this.methodName = methodName;
		this.paramType = paramType;
		this.paramValues = paramValues;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {

		return className;
	}

	/**
	 * @param className
	 *            the className to set
	 */
	public void setClassName(String className) {

		this.className = className;
	}

	/**
	 * @return the methodName
	 */
	public String getMethodName() {

		return methodName;
	}

	/**
	 * @param methodName
	 *            the methodName to set
	 */
	public void setMethodName(String methodName) {

		this.methodName = methodName;
	}

	/**
	 * @return the paramType
	 */
	public Class[] getParamType() {

		return paramType;
	}

	/**
	 * @param paramType
	 *            the paramType to set
	 */
	public void setParamType(Class[] paramType) {

		this.paramType = paramType;
	}

	/**
	 * @return the paramValues
	 */
	public Object[] getParamValues() {

		return paramValues;
	}

	/**
	 * @param paramValues
	 */
	public void setParamValues(Object[] paramValues) {

		this.paramValues = paramValues;
	}

	/**
	 * @return the result
	 */
	public Object getResult() {

		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(Object result) {

		this.result = result;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {

		return serialVersionUID;
	}

	public String toString() {

		return "class:" + className + ";" + "Method" + methodName;
	}

}
