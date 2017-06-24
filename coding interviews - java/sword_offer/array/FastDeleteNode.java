package sword_offer.array;
/**
 * 给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间删除该结点。
 * @author niuxiao
 *
 */
public class FastDeleteNode {

	public static void main(String[] args) {
		int n = 10;
		int del = (int)(Math.random()*n);//边界有问题
		ListNode head = new ListNode(0);
		ListNode node = head;
		ListNode target = null;
		for(int i = 1 ; i<n ; i++){
			node.next = new ListNode(i);
			node = node.next;
			if(i==del){
				target = node;
			}
		}
		printList(deleteNode(head,target));
	}

	private static void printList(ListNode head) {
		while(null!=head){
			System.out.print(head.value+" ");
			head = head.next;
		}
		System.out.println();
		
	}

	private static ListNode deleteNode(ListNode head, ListNode target) {
		if(null==head){
			return null;
		}
		if(target==head){
			head = head.next;
		}else if(null==target.next){
			head = deleteTail(head,target);
		}else{
			target.value = target.next.value;
			target.next = target.next.next ;
		}
		return head;
	}

	private static ListNode deleteTail(ListNode head, ListNode target) {
		ListNode node = head;
		while(null!=node){
			if(node.next==target){
				node.next=null;
			}
			node = node.next;
		}
		return head;
	}


}
