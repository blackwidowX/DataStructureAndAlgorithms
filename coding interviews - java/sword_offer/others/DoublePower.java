package sword_offer.others;
/**
 * 实现函数double power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 * @author niuxiao
 *
 */
public class DoublePower {

	public static void main(String[] args) {
		double result = power(-2,-3);
		System.out.println(result);
	}
	//使用快速幂方法
	//注意:1.依据各种exp的取值（0，正，负，奇偶），采取不同计算方法
	//	  2.base为0或1时，返回其本身
	public static double power( double base, int exp ){
		if(base==0||base==1){
			return base;
		}
		if(exp==0){//exp为0
			return 1;
		}
		double result = 0;
		int e = Math.abs(exp);
		if((e&1)==0){//exp为偶数
			result = power(base*base,e/2);
		}else{//exp为奇数
			result = power(base*base,e/2)*base;
		}
		////exp为正数时正常返回，负数时为base倒数的exp次方
		return exp>0 ? result : 1/result;
		
	}
}
