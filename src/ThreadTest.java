import java.awt.EventQueue;


	/**
	 * @param args
	 */
	
 class ThreadTest extends Thread{public void run() {
		
	 try {
		 
		 String a   =(String) ThreadTestFrame.Text1.getText();
		 do {if (a==null) {sleep(5000);} else {
		System.out.println("123" + " " + ThreadTestFrame.Text1);}
	} while (a!="0");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
 }
		public static void main(String[] args) {
			ThreadTest mAnotherThread;
			System.out.println(ThreadTestFrame.Text1);
			mAnotherThread = new ThreadTest();
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

