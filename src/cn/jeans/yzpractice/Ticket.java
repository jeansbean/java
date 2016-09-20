package cn.jeans.yzpractice;

public class Ticket implements Runnable{
	public static void main(String[] args) {
		Ticket tic = new Ticket();
		Thread t1 = new Thread(tic);
		Thread t2 = new Thread(tic);
		Thread t3 = new Thread(tic);
		
		t1.start();
		t2.start();
		t3.start();
	}
	int count = 200;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(count>0){
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"...remain"+count--);
				}
			}
		}
	}
}
