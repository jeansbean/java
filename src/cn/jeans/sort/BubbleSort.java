package cn.jeans.sort;
/*
 * ð������ÿ��ȡ������������ĩβ����һ������ʱ�������һ��������β
 * ��ѭ����L-1��
 * ��ѭ����i-1��
 */

public class BubbleSort{
	public static void sort(int[] arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	
	public static void main(String[] args){
		int[] array = {10,-1,4,2,8};
		sort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println("arr["+i+"]="+array[i]);
		}
	}
}
