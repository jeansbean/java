package cn.jeans.queue;
/*
 * 利用数组实现循环队列
 */
public class CirQueue<E>{
	E[] a;
	private static final int DEFAULT_SIZE=10;
	int front;
	int rear;
	
	public CirQueue(){
		this(DEFAULT_SIZE);
	}
	
	//初始化指定队列长度
	public CirQueue(int size){
		a=(E[])(new Object[size]);
		front=0;
		rear=0;
	}
	
	public boolean enqueue(E obj){
		//队列满
		if((rear+1)%a.length==front){
			return false;
		}else{
			a[rear]=obj;
			rear=(rear+1)%a.length;
			return true;
		}
	}
	public E dequeue(){
		if(rear==front)
			return null;
		else{
			E obj = a[front];
			front=(front+1)%a.length;
			return obj;
		}
	}
	
	public int size(){
		if(rear>front){
			return rear-front;
		}
		else
			return a.length-1;
	}
	
	public boolean isEmpty(){
		return rear==front;
	}
	
	
	
	
	public static void main(String[] args) {
		CirQueue<String> cqueue= new CirQueue<String>(4);
		cqueue.enqueue("everything");
		cqueue.enqueue("is");
		cqueue.enqueue("object");
		
		int size = cqueue.size();
		System.out.println("isEmpty:"+cqueue.isEmpty()+",size:"+size);
		
		for(int i=0;i<size;i++){
			System.out.print(cqueue.dequeue()+" ");
		}
	}
}
