package sword_offer.others;
/**
 * ��Ŀ����һ������ʵ�֣�������һ������ʱ�����ظ��������Ʊ�ʾ��1�ĸ�����
 * @author niuxiao
 *
 */
public class CountOne {

	public static void main(String[] args) {
		int num = -1;//Integer.MAX_VALUE;
		System.out.println(count1(num));
		System.out.println(count2(num));
	}

	//˼·���ӵ�λ��ʼһλһλͳ��1�ĸ���
	//��������1�������+���Ƹ���
	public static int count1(int num){
		int count = 0;
		for(int i = 0;i<Integer.SIZE;i++){
			count+=(num&1);
			num>>>=1;
		}
		return count;
	}
	//˼·����һ��������ȥ1���ٺ�ԭ�����������㣬������ұ�һ��1���0
	//     ��ôһ�������Ķ����Ʊ�ʾ���ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ�����
	public static int count2(int num){
		int count = 0;
		while(num!=0){
			count++;
			num&=(num-1);
		}
		return count;
	}
}
