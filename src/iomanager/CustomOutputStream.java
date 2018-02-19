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
	private boolean addLineStart;
	private String lineStart = ">   ";

	public CustomOutputStream(JTextComponent textOut) {
		this.textOut = textOut;
	}

	@Override
	public void write(int b) throws IOException {
		// redirects data to the text area
		if(b == 10) {
			addLineStart = true;
		}
		if (textOut.getClass().equals(new JTextArea())) {
			if(addLineStart)
				((JTextArea) textOut).append(lineStart);
			((JTextArea) textOut).append(String.valueOf((char) b));
		} else {
			textOut.setText(textOut.getText() + String.valueOf((char) b));
		}
		// scrolls the text area to the end of data
		addLineStart = false;
		textOut.setCaretPosition(textOut.getDocument().getLength());
	}
}