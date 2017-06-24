package sword_offer.array;
/**
 * ��Ŀ�����������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
 */
import java.util.*;

public class ReversePrint {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode pre = head;
		ListNode temp = null;
		for(int i=1;i<10;i++){
			temp = new ListNode(i);
			pre.next = temp;
			pre = temp;
		}
		temp = new ListNode(10,null);
		reversePrint1(head);
		reversePrint2(head);
	}

	private static void reversePrint1(ListNode node) {
		if(null!=node.next){
			reversePrint1(node.next);
			System.out.print(node.value + " ");
		}if(null==node.next){
			System.out.print(node.value + " ");
		}
	}
	
	private static void reversePrint2(ListNode node) {
		Stack<Integer> stack = new Stack<Integer>();
		while(null!=node){
			stack.push(node.value);
			node = node.next;
		}
		System.out.println();
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		
	}

}
