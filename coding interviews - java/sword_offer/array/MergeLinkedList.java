
package sword_offer.array;
/**
 * 题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的
 * @author niuxiao
 *
 */
public class MergeLinkedList {

	public static void main(String[] args) {
		int n1 = 10;
		ListNode head1 = new ListNode(0);
		ListNode node = head1;
		for(int i = 1; i<n1 ; i++){
			node.next = new ListNode(i*2);
			node = node.next;
		}
		int n2 = 13;
		ListNode head2 = new ListNode(1);
		node = head2;
		for(int i = 1; i<n2 ; i++){
			node.next = new ListNode(i*2+1);
			node = node.next;
		}
		ListNode head = merge(head1,head2);
		printList(head);

	}

	private static ListNode merge(ListNode head1, ListNode head2) {
		if(null==head1){
			return head2;
		}else if(null==head2){
			return head1;
		}
		ListNode head = null;
		ListNode cursor = null;//当前结点
		if(head1.value<head2.value){
			head = cursor =head1;
			head1 = head1.next;
		}else{
			head = cursor = head2;
			head2 = head2.next;
		}
		while(null!=head1&&null!=head2){
			if(head1.value < head2.value){
				cursor.next = head1;
				head1 = head1.next;
			}else{
				cursor.next = head2;
				head2 = head2.next;
			}
			cursor = cursor.next;
		}
		if(null!=head1){
			cursor.next = head1; 
		}
		if(null!=head2){
			cursor.next = head2; 
		}
		return head;
	}

	private static void printList(ListNode node) {
		while(null!=node){
			System.out.print(node.value+" ");
			node = node.next;
		}
	}
}
