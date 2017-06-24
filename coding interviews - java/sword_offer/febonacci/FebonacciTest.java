package sword_offer.febonacci;
/**
 * ��Ŀ��дһ������������n����쳲�������Fibonacci) ���еĵ�n�� 
 * ���ַ���ʵ��쳲�����
 * ���η����ݹ�ʵ�� --> �Զ�����
 * ��̬�滮��
 * 		   �ǵݹ飺������������ --> �Ե�����
 * 		   �ݹ飺���� --> �Զ�����
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
	//��̬�滮���Ե����ϣ�������ʵ��
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
	//��̬�滮���Ե����ϣ�����ʵ��
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
	

	//��ͨ�ݹ���η���
	//ȱ�㣺����������������ջ�ռ�,����ظ�����
	public static int febonacci3(int n){
		if(n==0||n==1){
			return n;
		}else{
			return febonacci3(n-1)+febonacci3(n-2);
		}
	}
	//�ݹ鶯̬�滮���Զ�����
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
			//��̬�������״̬��a[]��������ʱ����
			return a[n]=(f(n-1,a)+a[n-2]);
		}
	}
}
