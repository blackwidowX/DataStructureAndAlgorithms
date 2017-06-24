package sword_offer.structure;
/**
 * ��Ŀ��������ջʵ��һ�����С����е��������£���ʵ��������������appendTail ��deleteHead���ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ��ܡ�
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
	//Ϊ�������ʱ��ӡ���ô˷����ṩѭ��ֹͣ��־
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
