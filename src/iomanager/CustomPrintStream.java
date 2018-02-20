/**
 * 
 */
package iomanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author kapow
 *
 */
public class CustomPrintStream extends PrintStream{

	
	
	/**
	 * @param arg0
	 * @param arg1
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public CustomPrintStream(File arg0, String arg1) throws FileNotFoundException, UnsupportedEncodingException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @throws FileNotFoundException
	 */
	public CustomPrintStream(File arg0) throws FileNotFoundException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @throws UnsupportedEncodingException
	 */
	public CustomPrintStream(OutputStream arg0, boolean arg1, String arg2) throws UnsupportedEncodingException {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public CustomPrintStream(OutputStream arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public CustomPrintStream(OutputStream arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public CustomPrintStream(String arg0, String arg1) throws FileNotFoundException, UnsupportedEncodingException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @throws FileNotFoundException
	 */
	public CustomPrintStream(String arg0) throws FileNotFoundException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OutputStream getOut() {
		return out;
	}
}
