package cn.jeans.yzpractice;

public class Fticket implements Runnable{
	public static void main(String[] args) {
		Fticket f = new Fticket();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		Thread t3 = new Thread(f);
		t1.start();
		t2.start();
		t3.start();
	}
	long count = 200;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(count>0){
					try{
						Thread.sleep(10);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"ticket remain:"+count--);
				}
			}
		}
	}
}






















