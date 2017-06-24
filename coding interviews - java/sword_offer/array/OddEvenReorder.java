package sword_offer.array;

public class OddEvenReorder {
/**
 * 题目:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位予数组的后半部分。
 * @param args
 * @throws InterruptedException
 */
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {}; //{0,1,2,3,4,5,6,7,8};
		reorder(arr);
		//Thread.currentThread().sleep(2000);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void reorder(int[] arr) {
//		if(arr.length==1||arr==null){
//			return;
//		}
        int low = 0;  
        int high = arr.length - 1;  
  
        while (low < high) {  
             while((arr[low]&1)==1&&low<high){
            	 low++;
             }
             while((arr[high]&1)==0&&low<high){
            	 high--;
             }
        	 int temp = arr[low];
        	 arr[low] = arr[high];
        	 arr[high] = temp;
        }  
		
	}

}
