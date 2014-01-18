package vt;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainThreadTestFrame extends JFrame {

	private JTextArea textArea;
	private SharedData mSd;
	
	public MainThreadTestFrame(SharedData sd) {
		initialize();
		this.mSd = sd;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 229, 109);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 221, 76);
		getContentPane().add(panel);
		panel.setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(34, 0, 157, 25);
		panel.add(textArea);
		textArea.setText("");

		JButton btnNewButton = new JButton("TextChange");
		btnNewButton.setBounds(60, 44, 111, 23);
		panel.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeSharedData();
			}
		});

		
		final JLabel Text1 = new JLabel(" ");
		Text1.setBounds(4, 48, 46, 14);
		Text1.setText("1223");
	}
	
	private void changeSharedData() {
		if(mSd != null && mSd.isAccessEnabled()) {
			mSd.setAccessEnabled(false);
			if (textArea != null) {
				mSd.setSharedText(textArea.getText());
			}
			mSd.setChanged(true);
			mSd.setAccessEnabled(true);
		}
		System.out.println("mouse clicked");
	}

}
