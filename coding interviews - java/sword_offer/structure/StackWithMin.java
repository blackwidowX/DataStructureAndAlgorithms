package sword_offer.structure;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * ��Ŀ�� ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����С�ص�min ������
 * 		 �ڸ�ջ�У�����min��push ��pop��ʱ�临�Ӷȶ���0(1)��
 * @author niuxiao
 *
 */
public class StackWithMin <T extends Comparable<T>>{
	private Stack<T> stack = new Stack<T>();
	private Stack<T> minStack = new Stack<T>();
	
	public StackWithMin(){
		
	}
	
	public T pop(){
		if(this.stack.isEmpty()||this.minStack.isEmpty()){
			throw new EmptyStackException();
		}
		T e = this.stack.pop();
		this.minStack.pop();
		return e;
	}
	
	public T push(T e){
		T min;
		if(this.stack.isEmpty()&&this.minStack.isEmpty()){
			min = e;
		}else{
			min = this.minStack.peek();
		}
		this.minStack.push( e.compareTo(min)<0 ? e : min);
		return this.stack.push(e);
	}
	
	public T getMin(){
		return this.minStack.peek();
	}
	
	public static void main(String[] args) {
		StackWithMin<Integer> s = new StackWithMin<Integer>();
		for (int i = 3; i < 10; i++) {
			s.push(i);
		}
		for (int i = 0; i < 7; i++) {
			s.pop();
		}
		System.out.println(s.getMin());

	}

}
