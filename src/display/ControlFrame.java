package display;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import iomanager.CustomInputStream;
import iomanager.CustomOutputStream;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class ControlFrame extends JFrame {

	private JPanel contentPane;
	private JTextField stdIn;

	/**
	 * Create the frame.
	 */
	public ControlFrame() {
		this.setVisible(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel console = new JPanel();
		tabbedPane.addTab("Console", null, console, null);
		console.setLayout(new BorderLayout(0, 0));
		
		JTextArea stdOut = new JTextArea();
		stdOut.setEditable(false);
		console.add(stdOut, BorderLayout.CENTER);

		JScrollPane errorLog = new JScrollPane();
		tabbedPane.addTab("Errors", null, errorLog, null);
		tabbedPane.setEnabledAt(1, true);

		JTextPane stdErr = new JTextPane();
		stdErr.setBackground(Color.BLACK);
		stdErr.setSelectedTextColor(Color.BLUE);
		stdErr.setSelectionColor(Color.WHITE);
		stdErr.setFocusCycleRoot(false);
		stdErr.setFocusTraversalKeysEnabled(false);
		stdErr.setFocusable(false);
		stdErr.setForeground(Color.RED);
		stdErr.setEditable(false);
		errorLog.setViewportView(stdErr);
		
		stdIn = new JTextField();
		stdIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				System.out.println("Read in System.in");
				String s = "";
				for(char c: in)
					s += c;
				System.out.println(s);
			}
		});
		stdIn.setText("type inputs here");
		stdIn.setHorizontalAlignment(SwingConstants.TRAILING);
		stdIn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				stdIn.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				stdIn.setText("type inputs here");
			}
		});
		console.add(stdIn, BorderLayout.SOUTH);
		stdIn.setColumns(10);
				
		//Set the system console
		PrintStream printstreamOut = new PrintStream(new CustomOutputStream(stdOut));
		System.setOut(printstreamOut);
		PrintStream printstreamErr = new PrintStream(new CustomOutputStream(stdErr));
		System.setErr(printstreamErr);
		InputStream inputstream = new CustomInputStream(stdIn);
		System.setIn(inputstream);
	}

}
