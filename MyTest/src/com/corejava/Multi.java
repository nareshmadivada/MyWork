package com.corejava;

public class Multi extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		Multi t2 = new Multi();

		t1.start();
		t2.start();
	}

}
