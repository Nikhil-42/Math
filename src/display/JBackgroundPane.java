package display;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import java.awt.Graphics;
import java.awt.Image;

public class JBackgroundPane extends JDesktopPane{

	protected void paintComponent(Graphics g) {
		Image img = new ImageIcon(this.getClass().getResource("name")).getImage();
	}

}
