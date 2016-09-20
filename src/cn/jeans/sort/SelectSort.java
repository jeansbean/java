package cn.jeans.sort;

/*
 * ѡ������ÿ��ȡ��С������ǰ����һ�����򲻼Ƶ�һ����ȥͷ
 * ��ѭ����L��
 * ��ѭ����i-1������ÿ�ζ���δ�������λ��ʣ�µ�Ԫ�رȽϣ���С��������ǰ
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
