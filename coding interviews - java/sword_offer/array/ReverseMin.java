package sword_offer.array;
/**
 * ��Ŀ�� ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�� ���ǳ�֮�������ת������һ����������������һ����ת�� �����ת�������СԪ�ء���������{3��4, 5, 1, 2 ��Ϊ�� l1,2,3, 4��5}��һ����ת�����������СֵΪ1
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
		//ͨ�����ֲ����ҵ��ֽ��
		//�ֽ��Ϊ�����һλ����С�ڸ�λ����
		//��������������ǰһ���������е�����ֵ���ں�һ����������
		//low,high�ƶ�����:mid����ڵ�һ����������(a[mid]>a[low])����low����ƶ�
		//				  mid����ڵڶ�������(a[mid]<a[low])���������ƶ�high	
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
