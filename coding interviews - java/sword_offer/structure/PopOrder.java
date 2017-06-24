package sword_offer.structure;

import java.util.Stack;

/**
 * ��Ŀ�����������������У���һ�����б�ʾջ��ѹ��˳�����ж϶��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * @author niuxiao
 */
public class PopOrder {

	public static void main(String[] args) {
		int[] in = {1,2,3,4,5};
		int[] out = {4,5,3,2,1};
		boolean result = isPopOrder(in,out);
		System.out.println(result);
	}

	private static boolean isPopOrder(int[] in, int[] out) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		int j = 0;
		while(i<=in.length){
			if(stack.isEmpty()||stack.peek()!=out[j]){
				if(i!=in.length){
					stack.push(in[i++]);
				}else{
					i++;
				}
			}else{
				stack.pop();
				j++;
			}
		}
		if(stack.isEmpty()&&j==out.length){
			return true;
		}
		return false;
	}
	
	

}
