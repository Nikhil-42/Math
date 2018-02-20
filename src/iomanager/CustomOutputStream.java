package iomanager;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 * This class extends from OutputStream to redirect output to a JTextComponent
 * 
 * @author www.codejava.net
 *
 */
public class CustomOutputStream extends OutputStream {
	
	private JTextComponent textOut;
	private boolean firstLine = true;
	private String lineStart = ">   ";

	public CustomOutputStream(JTextComponent textOut) {
		this.textOut = textOut;
	}

	@Override
	public void write(int b) throws IOException {
		// redirects data to the text area
		if (textOut.getClass().equals(new JTextArea().getClass())) {
			if (firstLine)
				((JTextArea) textOut).append(lineStart);
			((JTextArea) textOut).append(String.valueOf((char) b));
			if(b == 10)
				((JTextArea) textOut).append(lineStart);
		} else {
			textOut.setText(textOut.getText() + String.valueOf((char) b));
		}
		// scrolls the text area to the end of data
		firstLine = false;
		textOut.setCaretPosition(textOut.getDocument().getLength());
	}
	
	public void clear() {
		textOut.setText("");
		firstLine = true;
	}
}