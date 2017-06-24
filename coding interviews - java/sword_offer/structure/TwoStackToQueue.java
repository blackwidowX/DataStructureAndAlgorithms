package sword_offer.structure;
/**
 * 题目：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail 和deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 * 
 */
import java.util.Stack;

public class TwoStackToQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		for(int i = 0; i<5;i++){
			q.appendTail(i);
		}
		while(!q.isEmpty()){
			System.out.println(q.deleteHead());
		}
		

	}
	

}

class Queue<T>{
	private Stack<T> s1 = new Stack<T>();
	private Stack<T> s2 = new Stack<T>();
	
	public Queue(){
		
	}
	//为方便测试时打印，用此方法提供循环停止标志
	public boolean isEmpty(){
		return s1.isEmpty()&&s2.isEmpty();
	}
	
	public void appendTail(T t){
		s1.add(t);
	}
	
	public T deleteHead(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.add(s1.pop());
			}
		}
		if(s2.isEmpty()){
			return null;
		}
		return s2.pop();
	}
	
	
}
