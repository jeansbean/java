package cn.jeans.sort;
/*
 * 插入排序：每次将数组的下一位（角标为i）插入于[0~i-1]的数组中。并对[0~i-1]数组排序，大于新元素的元素后移,一次排序后最小的在最前面
 * 外循环：L-1次
 * 内循环：
 */
public class InsertSort {
	public static void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i;(j>0)&&(arr[j]<arr[j-1]);j--){
				swap(arr,j,j-1);
			}
		}
		
	}
	public static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	public static void main(String[] args){
		int array[] = {8,-8,1,10,17};
		insertSort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println("arr["+i+"]="+array[i]);
		}
	}
}
