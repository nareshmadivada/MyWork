/**
 * 
 */
package com.corejava;

/**
 * @author naresh
 * 
 */

class Customer {
	int amt = 15000;

	synchronized void withdraw(int amt) {
		System.out.println("going to withdraw...");
		if (this.amt < amt) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		} else {
			this.amt -= amt;
			System.out.println("withdraw completed..."+this.amt);

		}

	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amt += amount;
		System.out.println("deposit completed... "+this.amt);
		notify();
	}

}

public class InterThreadComn {

	public static void main(String[] args) {
		 final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(16000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}

}
