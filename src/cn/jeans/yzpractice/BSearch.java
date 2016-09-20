package cn.jeans.yzpractice;

public class BSearch {
	public static void main(String[] args) {
		int[] a = {2,6,-2,0,1};
		Test.quickSort(a, 0, 4);
		for(int i:a){
			System.out.println(i);
		}
		
		int tarpos = biSearch(a,-2);
		System.out.println("tappos:"+tarpos);
	}
	
	public static int biSearch(int[] arr,int tar){
		
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]>tar){
				high=mid-1;
			}
			if(arr[mid]<tar){
				low=mid+1;
			}
			if(arr[mid]==tar){
				return mid;				
			}
		}
		return -1;
	}
}
