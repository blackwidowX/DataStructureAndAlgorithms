package sword_offer.others;
/**
 * 题目：用一个函数实现，当输入一个整数时，返回该数二进制表示中1的个数。
 * @author niuxiao
 *
 */
public class CountOne {

	public static void main(String[] args) {
		int num = -1;//Integer.MAX_VALUE;
		System.out.println(count1(num));
		System.out.println(count2(num));
	}

	//思路：从低位开始一位一位统计1的个数
	//方法：与1做与操作+右移该数
	public static int count1(int num){
		int count = 0;
		for(int i = 0;i<Integer.SIZE;i++){
			count+=(num&1);
			num>>>=1;
		}
		return count;
	}
	//思路：把一个整数减去1，再和原整数做与运算，会把最右边一个1变成0
	//     那么一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作。
	public static int count2(int num){
		int count = 0;
		while(num!=0){
			count++;
			num&=(num-1);
		}
		return count;
	}
}
