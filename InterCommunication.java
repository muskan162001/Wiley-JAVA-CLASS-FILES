//public package javaThread;

class BanckAccount{
	int amount=1000;
	public synchronized void withdrawAmount(int amount) {
		if(this.amount<amount) {
			System.out.println("Amount is less");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Amount Withdraw is Successful");

	}
	public synchronized void deposite(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited");
		notify();
	}
}

public class InterCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					BanckAccount ba=new BanckAccount();
					Thread t1=new Thread() {
						public void run() {
							ba.withdrawAmount(1500);
						}
					};
					Thread t2=new Thread() {
						public void run() {
							ba.deposite(1000);
							
						}
					};
					t1.start();
					t2.start();
	}

}
 
