package vt;

import java.awt.EventQueue;

public class ThreadsExample {

	private static final Object EXIT_KEY_STRING = "1";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//main method is a thread
		//create object of type SharedData that all threads could access
		final SharedData sd = new SharedData();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//init ui and pass SharedData object to constructor
					//ui running in separate thread
					MainThreadTestFrame frame = new MainThreadTestFrame(sd);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//this cycle will be in progress in main thread and ui is in separate thread
		//will return from cycle when shared text equal exit key
		String sharedText = "";
		do {
			
			System.out.println("123 " + sharedText);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(sd.isChanged() && sd.isAccessEnabled() ) {
				sd.setAccessEnabled(false);
					sharedText = sd.getSharedText();
				sd.setAccessEnabled(true);
			}
		} while (!sharedText.equals(EXIT_KEY_STRING));
		
		System.out.println("finished");
	}

}
