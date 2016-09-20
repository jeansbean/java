package cn.jeans.linkedList;

public class LinkedList {
	class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data = data;
		}
		
		//添加节点(尾部)
		public void add(Node node){
			if(this.next==null){
				this.next=node;
			}else{
				this.next.add(node);//递归
			}
		}
		//打印节点
		public void print(){
			if(this.next!=null){
				System.out.println(this.data+"-->");
				this.next.print();
			}else{
				System.out.println(this.data+"\n");
			}
		}
		//查找节点(按节点的值查找)
		public boolean search(String data){
			if(this.data.equals(data)){
				return true;
			}
			if(this.next!=null){
				return this.next.search(data);
			}else{
				return false;
			}
		}
		//删除节点（按值）
		public void delete(Node previous,String data){
			if(this.data.equals(data)){
				previous.next=this.next;
			}else{
				if(this.next!=null){
				this.next.delete(this, data);//向后递归，查找符合条件的节点
				}
			}
		}
	}
	
	private Node root;//头结点
	int size;
	
	//打印节点
	public void print(){
		if(root!=null)
			this.root.print();
	}
	//查找节点
	public boolean searchNode(String data){
		return root.search(data);
	}
	//增加节点
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.root==null){
			root = newNode;
		}else{
			this.root.add(newNode);
		}
	}
	//删除节点
	public void deleteNode(String data){
		if(root.data.equals(data)){
			if(root.next!=null){
				root = root.next;
			}else{
				root = null;
			}
		}else{
			root.next.delete(this.root,data);
		}
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.print();
		
		String searchNode = "B";
		System.out.println("查找节点:" + searchNode);
		String result = l.searchNode(searchNode)?"找到!":"没找到!";
		System.out.println("查找结果：" + result);
		System.out.println("删除节点：" + searchNode);
		l.deleteNode(searchNode);
		System.out.println("删除节点后的链表：");
		l.print();
		l.addNode("E");
		System.out.println("添加节点后的链表：");
		l.print();
	}
}


