package cn.jeans.sort;
/*
 * �������򣺹ؼ����һ�׼λ�á����һλ����ɨ�裬С�ڻ�׼ֵ����֮��������֮���ƣ���λ����ɨ�裬���ڻ�׼ֵ����֮��������֮���ƣ����ѭ��
 * ע�⣺һ����������У���׼��λ�øı䣬���ǻ�׼ֵ����
 * һ������֮�󣬻�׼λ������ֵ��С�ڻ�׼ֵ���Ҳ��ֵ�����ڻ�׼ֵ��
 * Ȼ���׼λ����������ֱ�ͨ�����Ž������򣨵ݹ飩
 */
public class QuickSort {
	public static void quickSort(int[] arr,int low,int high){
			int pivotpos;//��׼λ��
			if(low<high){
				pivotpos=Partition(arr,low,high);//���û����㷨���õ���׼λ��
				quickSort(arr,low,pivotpos-1);//������ݹ�����
				quickSort(arr,pivotpos+1,high);//������ݹ�����
			}
	}

	public static int Partition(int[] arr,int i,int j){//�����㷨��Ϊ�˵õ���һ����׼λ��pivotpos
			int pivot=arr[i];//��׼
			while(i<j){
				while(i<j && arr[j]>pivot){
					j--;
				}
				if(i<j){
					arr[i]=arr[j];
					i++;
				}
				while(i<j && arr[i]<pivot){
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
	
	public static void main(String[] args){
		int array[] = {8,-8,10,1,3,6};
		quickSort(array,0,array.length-1);
		
		for(int i=0;i<array.length;i++){
			System.out.println("arr["+i+"]="+array[i]);
		}
	}
}
