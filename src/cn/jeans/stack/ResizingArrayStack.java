package cn.jeans.stack;
/*
 * 使用数组实现栈
 */
import java.util.Iterator;

public class ResizingArrayStack<E> implements Iterable<E>{
	
	private E[] arr = (E[]) new Object[1]; //定义数组存放栈
	private int N = 0;//表示栈的大小，是动态的
	
	public boolean isEmpty(){
		 return N==0;
	}
	public int size(){
		return N;
	}
	private void resize(int max){//能够动态调整数组大小
		//将栈移动到一个大小为max的新数组
		E[] temp = (E[])new Object[max];
		for(int i=0;i<N;i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public void push(E e){
		if(N==arr.length){
			resize(2*arr.length);//如果栈满，则调整存放栈的数组为2倍大小
		}
			arr[N++]=e;
	}
	public E pop(){
		E e = arr[--N];
		arr[N] = null;//避免对象游离
		if(N>0&&N==arr.length/4){//如果栈大小只占了数组的1/4大小，则将数组长度减为原来的1/2
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
		
		System.out.println("删除后：");
		String s1 = aStc.pop();
		String s2 = aStc.pop();
		Iterator ite = aStc.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
