package sword_offer.array;
/**
 * 题目：输入链表的头结点，从尾到头反过来打印出每个结点的值。
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
