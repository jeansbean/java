package cn.jeans.queue;
/*
 * 利用Node类实现链队列
 */
public class LinkQueue<T>{
	
	private class Node{
		public T data;
		public Node next;
		public Node(){};
		
		public Node(T data,Node next){
			this.data = data;
			this.next=next;
		}
	}
	
	private Node front;//头结点
	private Node rear;//尾节点
	private int size=0;//队列长度
	
	public LinkQueue(){
		Node n = new Node(null,null);
		n.next = null;
		front=rear=n;
	}
	
	public void enqueue(T data){
		Node s = new Node(data,null);
		rear.next=s;
		rear=s;
		size++;
	}
	
	public T dequeue(){
		if(rear==front){
			try{
				throw new Exception("堆栈为空");
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
		}else{
			Node p = front.next;
			T x=p.data;
			front.next=p.next;
			if(p.next==null)
				rear=front;
			p=null;
			size--;
			return x;
		}	
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public String toString(){
		if(isEmpty()){
			return "[]";
		}else{
			StringBuilder sb = new StringBuilder("[");
			for(Node current=front.next;current!=null;current=current.next){
				sb.append(current.data.toString()+",");
			}
			int len = sb.length();
			return sb.delete(len-2, len).append("]").toString();
		}
	}
	
	public static void main(String[] args) {
		LinkQueue<Integer> queue = new LinkQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		System.out.println(queue);
		System.out.println("出列："+queue.dequeue());
		System.out.println("队列长度="+queue.size());
		System.out.println(queue);
		System.out.println("出列："+queue.dequeue());
		System.out.println("队列长度="+queue.size());
		System.out.println(queue);
		System.out.println("出列："+queue.dequeue());
		System.out.println("队列长度="+queue.size());
		System.out.println(queue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
