package cn.jeans.stack;
/*
 * ʹ������ʵ��ջ
 */
import java.util.Iterator;

public class ResizingArrayStack<E> implements Iterable<E>{
	
	private E[] arr = (E[]) new Object[1]; //����������ջ
	private int N = 0;//��ʾջ�Ĵ�С���Ƕ�̬��
	
	public boolean isEmpty(){
		 return N==0;
	}
	public int size(){
		return N;
	}
	private void resize(int max){//�ܹ���̬���������С
		//��ջ�ƶ���һ����СΪmax��������
		E[] temp = (E[])new Object[max];
		for(int i=0;i<N;i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public void push(E e){
		if(N==arr.length){
			resize(2*arr.length);//���ջ������������ջ������Ϊ2����С
		}
			arr[N++]=e;
	}
	public E pop(){
		E e = arr[--N];
		arr[N] = null;//�����������
		if(N>0&&N==arr.length/4){//���ջ��Сֻռ�������1/4��С�������鳤�ȼ�Ϊԭ����1/2
			resize(arr.length/2);
		}
		return e;
	}
	
	public Iterator<E> iterator() {
		return new ReverseArrayIterator();
	}
	
	public class ReverseArrayIterator implements Iterator<E>{
		private int i = N;
		public boolean hasNext(){
			return i>0;
		}
		public E next(){
			return arr[--i];
		}
		public void remove(){}
	}
	
	public static void main(String[] args) {
		ResizingArrayStack<String> aStc = new ResizingArrayStack<String>();
		aStc.push("A");
		aStc.push("B");
		aStc.push("C");
		aStc.push("D");
		aStc.push("E");
		System.out.println(aStc.N);
		
		Iterator it = aStc.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("ɾ����");
		String s1 = aStc.pop();
		String s2 = aStc.pop();
		Iterator ite = aStc.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
