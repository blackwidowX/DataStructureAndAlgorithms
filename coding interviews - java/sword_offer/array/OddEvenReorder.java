package sword_offer.array;

public class OddEvenReorder {
/**
 * ��Ŀ:����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ����������λ�������ǰ�벿�֣�����ż��λ������ĺ�벿�֡�
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
