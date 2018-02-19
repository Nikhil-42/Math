package iomanager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JTextField;

/**
 * This class extends from OutputStream to redirect output to a JTextArrea
 * 
 * @author www.codejava.net
 *
 */
public class CustomInputStream extends InputStream {
	private JTextField textField;

	public CustomInputStream(JTextField textField) {
		this.textField = textField;
	}

	@Override
	public int read() throws IOException {
		String allText = textField.getText();
		int l = allText.length();
		if (l > 1) {
			textField.setText(allText.substring(1, l));
		} else if (l == 1) {
			textField.setText("");
		} else if (l == 0) {
			return -1;
		}
		return allText.charAt(0);
	}
	
	public String readln() throws IOException {
		ArrayList<Character> in = new ArrayList<Character>();
		int i = 0;
		while(i != -1) {
			try {
				i = System.in.read();
				in.add((char) i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		in.remove(in.size()-1);
		System.out.println("Read in System.in");
		String s = "";
		for(char c: in)
			s += c;
		return s;
	}
}