package sword_offer.array;
/**
 * 题目： 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。输入一个递增排序的数组的一个旋转， 输出旋转数组的最小元素。例如数组{3，4, 5, 1, 2 ｝为｛ l1,2,3, 4，5}的一个旋转，该数组的最小值为1
 * @author niuxiao
 *
 */
public class ReverseMin {

	public static void main(String[] args) {
		int[] a = {6};
		int min = findMin(a);
		System.out.println(min);

	}
	
	public static int findMin(int[] a){
		if(a.length==1){
			return a[0];
		}
		int low = 0;
		int high = a.length - 1;
		int mid = low;
		//通过二分查找找到分界点
		//分界点为：其后一位数字小于该位数字
		//题中隐含条件：前一个递增序列的所有值大于后一个递增序列
		//low,high移动条件:mid如果在第一个递增序列(a[mid]>a[low])，则将low向后移动
		//				  mid如果在第二个序列(a[mid]<a[low])，则向左移动high	
		while(low<high){
			mid = (low + high)/2;
			if(a[mid]>a[mid+1]){
				return a[mid+1];
			}else if(a[mid]>a[low]){
				low = mid;
			}else{
				high = mid;
			}
		}
		return -1;
	}
}
