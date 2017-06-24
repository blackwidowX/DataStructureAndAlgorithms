package sword_offer.others;
/**
 * 题目：输入数字n，按顺序打印出从1最大的n位十进制数。
 * 		比如输入3，则打印出1、2、3一直到最大的3位数即999。
 * @author niuxiao
 *
 */
public class PrintOneToNMax {

	public static void main(String[] args) {
		int n = 2;
		printOneToNMax(n);
	}

	public static void printOneToNMax(int n) {
		if(n<=0){
			throw new RuntimeException("Invalid input ...");
		}
		int[] num = new int[n];
		for(int i = 0; i<n; i++){
			num[i] = 0;
		}
		do{
			printNum(num);
		}while(plus(num)!=null);
	}

	private static int[] plus(int[] num) {
		int flag;
		int index = 0;
		do{
			flag = (num[index]+1)/10;
			num[index] = (num[index]+1)%10;
			if(flag==1){
				index++;
			}
		}while(flag==1&&index<num.length);
		if(index>=num.length){
			num = null;
		}
		return num;
	}

	private static void printNum(int[] num) {
		int index = num.length-1;
		while(index>=0&&num[index]==0){
			index--;
		}
		for(int i = index; i>=0; i--){
			System.out.print(num[i]);
		}
		if(index<0){
			System.out.println(0);
		}else{
			System.out.println();
		}
	}

}
