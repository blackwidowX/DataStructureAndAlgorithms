package sword_offer.array;
/**
 * ��Ŀ������һ������������һ�������ͷ��㣬��ת�����������ת�������ͷ��㡣
 * @author niuxiao
 *
 */
public class ReverseList {

	public static void main(String[] args) {
		int n = 10;
		ListNode head = new ListNode(0);
		ListNode node = head;
		for(int i = 1; i<n ; i++){
			node.next = new ListNode(i);
			node = node.next;
		}
		node = reverseList(head);
		printList(node);

	}

	private static void printList(ListNode node) {
		while(null!=node){
			System.out.println(node.value);
			node = node.next;
		}
	}

	private static ListNode reverseList(ListNode head) {
		ListNode next;
		ListNode cur = head.next;
		head.next = null;
		while(null!=cur){
			next = cur.next;
			cur.next = head;
			head = cur;
			cur = next;
		}
		return head;
	}

}
