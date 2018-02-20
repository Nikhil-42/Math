package templates;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class JBackgroundPane extends JDesktopPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		Image img = new ImageIcon(this.getClass().getResource("/resources/Calculator-icon.png")).getImage();
		
		Graphics2D g2d = (Graphics2D)g;
		double x = img.getWidth(null);
		double y = img.getHeight(null);
		g2d.scale(getWidth()/x, getHeight()/y);
		g2d.drawImage(img, 0, 0, this);
	}
}
