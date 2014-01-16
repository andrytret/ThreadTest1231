import java.awt.EventQueue;

/**
 * @param args
 */

class ThreadTest extends Thread {

	public void run() {

		try {
			String a = null;
			while (a != "0") {
				sleep(1000);
				a = ShareData.Text;
				if (a.equals("0")) {
					break;
				} 

				System.out.println("123" + " " + a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		ThreadTest mAnotherThread;
		mAnotherThread = new ThreadTest();
		mAnotherThread.start();
		{
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

}

// модификатор статик и его применение: класс, поле, метод.