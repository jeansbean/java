package cn.jeans.yzpractice;

public class Test1 {
	public static void main(String[] args) {
		int array[] = {-1,9,0,56,7};
		
		//bubbleSort(array);
		//selectSort(array);
		//insertSort(array);
		quickSort(array,0,array.length-1);
		for(int i:array){
			System.out.println(i);
		}
	}
	public static void swap(int[] a,int x,int y){
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	//√∞≈›≈≈–Ú
	public static void bubbleSort(int[] arr){
		
		for(int i=arr.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
	}
	//—°‘Ò≈≈–Ú
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j])
					swap(arr,i,j);
			}
		}
	}
	//≤Â»Î≈≈–Ú
	public static void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i;(j>0)&&(arr[j]<arr[j-1]);j--){
				swap(arr,j,j-1);
			}
		}
	}
	//øÏÀŸ≈≈–Ú
	public static void quickSort(int[] arr,int low,int high){
		int pivotpos;
		if(low<high){
			pivotpos = partition(arr,low,high);
			quickSort(arr,low,pivotpos-1);
			quickSort(arr,pivotpos+1,high);
		}
	}
	//∑÷÷ŒÀ„∑®
	public static int partition(int[] arr,int i,int j){
		int pivot=arr[i];
		while(i<j){
			while(i<j&&arr[j]>pivot){
				j--;
			}
			if(i<j){
				arr[i]=arr[j];
				i++;
			}
			while(i<j&&arr[i]<pivot){
				i++;
			}
			if(i<j){
				arr[j]=arr[i];
				j--;
			}
		}
		arr[i]=pivot;
		return i;
	}
}













