package cn.jeans.yzpractice;

public class ThreadTest1 extends Thread{
	public static void main(String[] args) {
		ThreadTest1 t1 =  new ThreadTest1();
		t1.start();
	}
	
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(i);
		}
	}
	
}
