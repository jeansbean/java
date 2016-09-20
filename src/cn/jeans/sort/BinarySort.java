package cn.jeans.sort;
/*
 * ���������۰��������
 * */
public class BinarySort {
	
	public static void binarySort(int[] arr){
		int i,j;
		int low,high,mid;
		int temp;
		for(i=1;i<arr.length;i++){
			temp=arr[i];//�൱�����Ƕ��ֲ���Ҫ�ҵ�ֵ
			low=0;
			high=i-1;
			while(low<=high){//���ֲ���temp��λ��
				mid=(low+high)/2;
				if(arr[mid]>temp)
					high=mid-1;
				else
					low=mid+1;
			}
			for(j=i-1;j>high;j--){
				arr[j+1]=arr[j];
			}
			arr[high+1]=temp;//ÿ��ѭ����Ŀ�Ķ��ǰ��²����ֵ����high+1����һ����high�Ĺ��̡�
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
