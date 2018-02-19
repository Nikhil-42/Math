package iomanager;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 * This class extends from OutputStream to redirect output to a JTextArrea
 * 
 * @author www.codejava.net
 *
 */
public class CustomOutputStream extends OutputStream {
	private JTextComponent textOut;

	public CustomOutputStream(JTextComponent textOut) {
		this.textOut = textOut;
	}

	@Override
	public void write(int b) throws IOException {
		// redirects data to the text area
		if (textOut.getClass().equals(new JTextArea())) {
			((JTextArea) textOut).append(String.valueOf((char) b));
		} else {
			textOut.setText(textOut.getText() + String.valueOf((char) b));
		}
		// scrolls the text area to the end of data
		textOut.setCaretPosition(textOut.getDocument().getLength());
	}
}