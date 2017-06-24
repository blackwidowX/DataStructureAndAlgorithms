package sword_offer.array;
/**
 * �������������ͷָ���һ�����ָ�룬����һ��������O(1)ʱ��ɾ���ý�㡣
 * @author niuxiao
 *
 */
public class FastDeleteNode {

	public static void main(String[] args) {
		int n = 10;
		int del = (int)(Math.random()*n);//�߽�������
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
