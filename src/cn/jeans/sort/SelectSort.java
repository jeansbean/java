package cn.jeans.sort;

/*
 * 选择排序：每次取最小至于最前。下一次排序不计第一个，去头
 * 外循环：L次
 * 内循环：i-1次数，每次都让未排序的首位与剩下的元素比较，较小的置于最前
 */
public class SelectSort {
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for (int j=i+1; j <arr.length; j++) {
				if(arr[i]>arr[j]){
					swap(arr,i,j);
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
		int array[] = {9,0,4,-3,7};
		selectSort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println("arr["+i+"]="+array[i]);
		}
	}
}
