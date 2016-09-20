package cn.jeans.sort;
/*
 * 快速排序：关键是找基准位置。最后一位向左扫描，小于基准值，与之交换，反之左移；首位向右扫描，大于基准值，与之交换，反之右移；如此循环
 * 注意：一趟排序过程中，基准的位置改变，但是基准值不变
 * 一趟排序之后，基准位置左侧的值均小于基准值，右侧的值均大于基准值。
 * 然后基准位置左右两侧分别通过快排进行排序（递归）
 */
public class QuickSort {
	public static void quickSort(int[] arr,int low,int high){
			int pivotpos;//基准位置
			if(low<high){
				pivotpos=Partition(arr,low,high);//利用划分算法，得到基准位置
				quickSort(arr,low,pivotpos-1);//左区间递归排序
				quickSort(arr,pivotpos+1,high);//右区间递归排序
			}
	}

	public static int Partition(int[] arr,int i,int j){//划分算法，为了得到下一个基准位置pivotpos
			int pivot=arr[i];//基准
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
