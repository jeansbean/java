package cn.jeans.yzpractice;

public class BSearchTest {
	public static void main(String[] args) {
		int[] array={-1,4,7,10,15};
		int pos = biSearch(array,7);
		System.out.println(pos);
	}
	public static int biSearch(int[] a,int tar){
		int low=0;
		int mid;
		int high=a.length-1;
		while(low<high){
			mid=(low+high)/2;
			if(a[mid]==tar){
				return mid;
			}
			if(a[mid]<tar){
				mid=low+1;
			}else if(a[mid]>tar){
				mid=high-1;
			}
		}
		return -1;
	}
}
