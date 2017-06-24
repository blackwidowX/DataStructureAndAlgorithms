import java.util.Map;
/**
 * 7 classical sorting algorithms
 * @author niuxiao
 *
 */
public class ClassicSorts {

	public static void main(String[] args) {
		int[] test = {1,3,2,6,8,7};
		bubbleSort(test);
		//selectSort(test);
		//insertSort(test);
		//shellSort(test);
		//mergeSort(test);
		//quickSort(test);
		//heapSort(test);
	}

	public static void heapSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			buildMaxHeap(arr,arr.length-1-i);
			swap(arr,0,arr.length-1-i);
		}
		printArr(arr);
	}

	private static void buildMaxHeap(int[] arr, int end) {
		for (int i = (end-1)/2; i >= 0; i--) {
			int k = i;
			int temp = arr[i];
			for (int j = 2*k+1; j < end; j*=2) {
				if(j<end&&arr[j]<arr[j+1]){
					j++;
				}
				if(temp>=arr[j]){
					break;
				}
				arr[k] = arr[j];
				k = j;
			}
			arr[k] = temp;
		}
	}

	public static void bubbleSort(int[] arr){
		boolean flag;
		for (int i = 0; i < arr.length-1; i++) {
			flag = true;
			for (int j = i; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
		printArr(arr);
	}
	
	public static void selectSort(int[] arr){
		int minIndex;
		for (int i = 0; i < arr.length-1; i++) {
			minIndex = i;
			for (int j = i; j < arr.length-1; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			if(i!=minIndex){
				swap(arr,i,minIndex);
			}
		}
		printArr(arr);
	}
	
	public static void insertSort(int[] arr){
		int target;
		for (int i = 1; i < arr.length; i++) {
			target = arr[i];
			int j = i-1;
			while(target<arr[j]&&j>=0){
					arr[j+1]=arr[j];
					j--;
			}
			if(j!=i-1){
				arr[j+1]=target;
			}
		}
		printArr(arr);
	}
	
	public static void shellSort(int[] arr){
		for (int step = arr.length/2; step > 0; step /= 2) {
			for (int i = step; i < arr.length ; i += step) {
				int temp = arr[i];
				int j = i - step;
				while(temp<arr[j]&&j>0){
					arr[j + step] = arr[j];
					j -= step;
				}
				arr[j + step] = temp;
			}
		}
		printArr(arr);
	}
	public static void mergeSort(int[] arr){
		mSort(arr,0,arr.length-1);
		printArr(arr);
	}
	private static void mSort(int[] arr, int low, int high) {
		if(low>=high){
			return;
		}
		int mid = (low+high)/2;
		mSort(arr,low,mid);
		mSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high-low+1];
		int i = low;
		int j = mid+1;
		int k = 0;
		while(i<=mid&&j<=high){
			if(arr[i]<arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		while(j<=high){
			temp[k++]=arr[j++];
		}
		for (int k2 = 0; k2 < temp.length; k2++) {
			arr[low+k2] = temp[k2];
		}
	}

	public static void quickSort(int[] arr){
		qSort(arr,0,arr.length-1);
		printArr(arr);
	}

	private static void qSort(int[] arr, int low, int high) {
		if(low>high){
			return;
		}
		int target = arr[low];
		int i = low;
		int j = high;
		while(i<j){
			while(arr[j]>=target&&i<j){
				j--;
			}
//			if(i<j){
//				arr[i++]=arr[j];
//			}
			while(arr[i]<target&&i<j){
				i++;
			}
//			if(i<j){
//				arr[j--]=arr[i];
//			}
			if(i<j){
				swap(arr,i++,j--);
			}
		}
		arr[i]=target;
		qSort(arr,low,i-1);
		qSort(arr,i+1,high);
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
	
	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
