package cn.jeans.sort;
/*
 * ��������ÿ�ν��������һλ���Ǳ�Ϊi��������[0~i-1]�������С�����[0~i-1]�������򣬴�����Ԫ�ص�Ԫ�غ���,һ���������С������ǰ��
 * ��ѭ����L-1��
 * ��ѭ����
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
