package sword_offer.others;
/**
 * ʵ�ֺ���double power(double base, int exponent)����base��exponent�η�������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
 * @author niuxiao
 *
 */
public class DoublePower {

	public static void main(String[] args) {
		double result = power(-2,-3);
		System.out.println(result);
	}
	//ʹ�ÿ����ݷ���
	//ע��:1.���ݸ���exp��ȡֵ��0������������ż������ȡ��ͬ���㷽��
	//	  2.baseΪ0��1ʱ�������䱾��
	public static double power( double base, int exp ){
		if(base==0||base==1){
			return base;
		}
		if(exp==0){//expΪ0
			return 1;
		}
		double result = 0;
		int e = Math.abs(exp);
		if((e&1)==0){//expΪż��
			result = power(base*base,e/2);
		}else{//expΪ����
			result = power(base*base,e/2)*base;
		}
		////expΪ����ʱ�������أ�����ʱΪbase������exp�η�
		return exp>0 ? result : 1/result;
		
	}
}
