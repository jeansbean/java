package cn.jeans.yzpractice;

public class Threadbyextends {
	public static void main(String[] args) {
	Tickett t = new Tickett();
	t.start();
	}
}

class Tickett extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
