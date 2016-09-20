package cn.jeans.search;

public class BiSearch {
	
	public static int binarySearch(int[] arr,int i){
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low<=high){
			mid = (low+high)/2;
			if(arr[mid]==i){
				return mid;
			}else if(arr[mid]>i)
				high=mid-1;
			 else if(arr[mid]<i)
				low=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7,8,9,10};
		int goal = 9;
		int pos = binarySearch(array,goal);
		System.out.println("the position of "+goal+" is:"+pos);
	}
}
