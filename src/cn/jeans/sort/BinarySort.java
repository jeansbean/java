package cn.jeans.sort;
/*
 * 二分排序：折半插入排序。
 * */
public class BinarySort {
	
	public static void binarySort(int[] arr){
		int i,j;
		int low,high,mid;
		int temp;
		for(i=1;i<arr.length;i++){
			temp=arr[i];//相当于我们二分查找要找的值
			low=0;
			high=i-1;
			while(low<=high){//二分查找temp的位置
				mid=(low+high)/2;
				if(arr[mid]>temp)
					high=mid-1;
				else
					low=mid+1;
			}
			for(j=i-1;j>high;j--){
				arr[j+1]=arr[j];
			}
			arr[high+1]=temp;//每次循环的目的都是把新插入的值赋给high+1。是一次找high的过程。
		}
	} 
	public static void main(String[] args){
		int array[] = {9,0,4,-3,7};
		binarySort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println("arr["+i+"]="+array[i]);
		}
	}
}
