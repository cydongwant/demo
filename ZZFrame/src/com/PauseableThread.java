package com;

public class PauseableThread extends Thread {
	// ReentrantLock pauseLock = new ReentrantLock();
	// Condition condition = pauseLock.newCondition();
	Object pause = new Object();

	public PauseableThread(Runnable runnable) {
		super(runnable);
		// TODO Auto-generated constructor stub
		this.isInterrupted();
	}

	public PauseableThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int count = 0;
		while (!isInterrupted()) {
			count++;
			System.out.println("ÔËÐÐÖÐ..." + count);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void resumeThread() {
		synchronized (this) {
			this.notifyAll();
		}
	}

	public void pauseThread() {
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
