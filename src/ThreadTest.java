import java.awt.EventQueue;

class ShareData extends Thread {
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

 public class ThreadTest {
		static ShareData mAnotherThread;

		public void main(String[] args) {
			System.out.println(ThreadTestFrame.Text1);
			mAnotherThread = new ShareData();
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

	}}}

