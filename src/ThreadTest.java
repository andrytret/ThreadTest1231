import java.awt.EventQueue;

class Thread1 extends Thread {
	@Override
	public void run() {
			try {do {
			System.out.println("123" + " " + ThreadTestFrame.Text1);

		} while (ThreadTestFrame.Text1.equals("0"));
	
				
			} catch (Exception e) {
				e.printStackTrace();
			}

	/**
	 * @param args
	 */

 class ThreadTest {
 }}
		public static void main(String[] args) {
			Thread1 mAnotherThread;
			System.out.println(ThreadTestFrame.Text1);
			mAnotherThread = new Thread1();
			mAnotherThread.start();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ThreadTestFrame window = new ThreadTestFrame();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	}

