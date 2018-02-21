package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import iomanager.CommandLine;
import iomanager.CustomInputStream;
import iomanager.CustomOutputStream;
import iomanager.CustomPrintStream;

public class ControlFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setOpaque(false);
		scrollPane.setAutoscrolls(true);
		console.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea stdOut = new JTextArea();
		scrollPane.setViewportView(stdOut);
		stdOut.setMargin(new Insets(2, 8, 2, 2));
		stdOut.setSelectionColor(Color.WHITE);
		stdOut.setSelectedTextColor(Color.MAGENTA);
		stdOut.setBackground(Color.BLACK);
		stdOut.setForeground(Color.GREEN);
		stdOut.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		stdOut.setEditable(false);
		
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
		
		JTextField stdIn = new JTextField();
		stdIn.requestFocus();
		stdIn.setBackground(Color.BLACK);
		stdIn.setForeground(Color.GREEN);
		stdIn.setSelectedTextColor(Color.MAGENTA);
		stdIn.setSelectionColor(Color.WHITE);
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
		CustomPrintStream printstreamOut = new CustomPrintStream(new CustomOutputStream(stdOut));
		System.setOut(printstreamOut);
		CustomPrintStream printstreamErr = new CustomPrintStream(new CustomOutputStream(stdErr));
		System.setErr(printstreamErr);
		CustomInputStream inputstream = new CustomInputStream(stdIn);
		System.setIn(inputstream);
		
		//Action Events
		
		//System.in [keyPress (ENTER)]
		stdIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String in = ((CustomInputStream) System.in).readln();
					System.out.println(in);
					CommandLine.runCommand(in);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
