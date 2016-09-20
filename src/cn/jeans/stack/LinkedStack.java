package cn.jeans.stack;

import java.util.Iterator;

public class LinkedStack<E> implements Iterable{
	private Node first;
	private int N;
	
	private class Node{
		E e;
		Node next;
	}
	public boolean isEmpty(){
		return N==0;//return first == null;
	}
	public int size(){
		return N;
	}
	public void push(E e){
		Node oldfirst = first;
		first = new Node();
		first.e = e;
		first.next = oldfirst;
		N++;
	}
	public E pop(){
		E e = first.e;
		first = first.next;
		N--;
		return e;
	}
	public Iterator<E> iterator() {
		return new ReverseIterator();
	}
	public class ReverseIterator implements Iterator<E>{
		private Node current = first;
		public boolean hasNext(){
			return current!=null;
		}

		public E next() {
			E e = current.e;
			current = current.next;
			return e;
		}

		public void remove() {
		}
		
	}  
	public static void main(String[] args) {
		LinkedStack<String> lStc = new LinkedStack<String>();
		
		lStc.push("A");
		lStc.push("B");
		lStc.push("C");
		lStc.push("D");
		lStc.push("E");
		Iterator it = lStc.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("É¾³ýºó£º");
		lStc.pop();
		Iterator ite = lStc.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
