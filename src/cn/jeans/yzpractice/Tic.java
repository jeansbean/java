package cn.jeans.yzpractice;

public class Tic implements Runnable{
	public static void main(String[] args) {
		Tic t = new Tic();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
	}
	int count = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){		
				if(count>0){
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"remain:"+count--);
				}
			}
		}
	}
}
