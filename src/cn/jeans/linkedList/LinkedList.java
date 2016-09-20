package cn.jeans.linkedList;

public class LinkedList {
	class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data = data;
		}
		
		//��ӽڵ�(β��)
		public void add(Node node){
			if(this.next==null){
				this.next=node;
			}else{
				this.next.add(node);//�ݹ�
			}
		}
		//��ӡ�ڵ�
		public void print(){
			if(this.next!=null){
				System.out.println(this.data+"-->");
				this.next.print();
			}else{
				System.out.println(this.data+"\n");
			}
		}
		//���ҽڵ�(���ڵ��ֵ����)
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
		//ɾ���ڵ㣨��ֵ��
		public void delete(Node previous,String data){
			if(this.data.equals(data)){
				previous.next=this.next;
			}else{
				if(this.next!=null){
				this.next.delete(this, data);//���ݹ飬���ҷ��������Ľڵ�
				}
			}
		}
	}
	
	private Node root;//ͷ���
	int size;
	
	//��ӡ�ڵ�
	public void print(){
		if(root!=null)
			this.root.print();
	}
	//���ҽڵ�
	public boolean searchNode(String data){
		return root.search(data);
	}
	//���ӽڵ�
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.root==null){
			root = newNode;
		}else{
			this.root.add(newNode);
		}
	}
	//ɾ���ڵ�
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
		System.out.println("���ҽڵ�:" + searchNode);
		String result = l.searchNode(searchNode)?"�ҵ�!":"û�ҵ�!";
		System.out.println("���ҽ����" + result);
		System.out.println("ɾ���ڵ㣺" + searchNode);
		l.deleteNode(searchNode);
		System.out.println("ɾ���ڵ�������");
		l.print();
		l.addNode("E");
		System.out.println("��ӽڵ�������");
		l.print();
	}
}


