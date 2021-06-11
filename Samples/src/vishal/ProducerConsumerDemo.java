package vishal;

class Q{
	
	int num;
	boolean valSet;
	Q(){
		num = 0;
		valSet = false;
	}
	synchronized void put() {
		while(valSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		num++;		
		System.out.println("PUT VALUE "+num);
		valSet = true;
		notify();
		
		
	}
	synchronized void get() {
		while(!valSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("TOPMOST VALUE "+num);
		valSet = false;
		notify();
	}
}

class Producer extends Thread{
	Q q;
	Producer(Q q){
		this.q = q;
		this.start();
	}
	public void run() {
		while(true) {			
			q.put();
			
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}

class Consumer extends Thread{
	Q q;
	Consumer(Q q){
		this.q = q;
		this.start();
	}
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

	}

}
