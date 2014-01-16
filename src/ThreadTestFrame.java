

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ThreadTestFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	 /* public static void main(String[] args) { EventQueue.invokeLater(new
	  Runnable() { public void run() { try { ThreadTestFrame window = new
	  ThreadTestFrame(); window.frame.setVisible(true); } catch (Exception e) {
	  e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the application.
	 */
	public JTextArea textArea;
    public static JLabel Text1;
	public ThreadTestFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 229, 109);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 221, 76);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		final JTextArea textArea = new JTextArea();
		textArea.setBounds(34, 0, 157, 25);
		panel.add(textArea);
		textArea.setText("");
		
		JButton btnNewButton = new JButton("TextChange");
		btnNewButton.setBounds(60, 44, 111, 23);
		panel.add(btnNewButton);
		
		 final JLabel Text1 = new JLabel(" ");
		Text1.setBounds(4, 48, 46, 14);
	

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = (String) textArea.getText();
				Text1.setText(t1);
			
			}

			
			
		});

	}
}
