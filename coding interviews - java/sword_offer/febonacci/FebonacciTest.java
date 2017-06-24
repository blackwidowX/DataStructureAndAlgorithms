package sword_offer.febonacci;
/**
 * 题目：写一个函数，输入n，求斐波那契（Fibonacci) 数列的第n项 
 * 四种方法实现斐波那契
 * 分治法：递归实现 --> 自顶向下
 * 动态规划：
 * 		   非递归：三变量，数组 --> 自底向上
 * 		   递归：数组 --> 自顶向下
 * @author niuxiao
 *
 */
public class FebonacciTest {

	public static void main(String[] args) {
		int result = febonacci1(5);
		System.out.println(result);
		result = febonacci2(5);
		System.out.println(result);
		result = febonacci3(5);
		System.out.println(result);
		result = febonacci4(5);
		System.out.println(result);

	}
	//动态规划，自底向上，三变量实现
	public static int febonacci1(int n){
		if(n==0||n==1){
			return n;
		}
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 2; i <= n; i++ ){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	//动态规划，自底向上，数组实现
	public static int febonacci2(int n){
		if(n==0||n==1){
			return n;
		}
		int[] a = new int[n+1];
		for(int i = 0; i <= n; i++ ){
			if(i==0||i==1){
				a[i]=i;
			}else{
				a[i] = a[i-1] + a[i-2];
			}
		}
		return a[n];
	}
	

	//普通递归分治方法
	//缺点：大量迭代不断消耗栈空间,多次重复计算
	public static int febonacci3(int n){
		if(n==0||n==1){
			return n;
		}else{
			return febonacci3(n-1)+febonacci3(n-2);
		}
	}
	//递归动态规划，自顶向下
	public static int febonacci4(int n){
		if(n<0){
			return -1;
		}
		int[] a = new int[n+1];
		return f(n,a);
	}
	public static int f(int n,int a[]){
		if(n==0||n==1){
			return a[n] = n;
		}else{
			//动态填表，保存状态至a[]，供回溯时计算
			return a[n]=(f(n-1,a)+a[n-2]);
		}
	}
}
