package sword_offer.array;
/**
 * ��Ŀ������һ����������������е�����k ����㣮
 * @author niuxiao
 *
 */
public class KthLastNode {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		ListNode head = new ListNode(0);
		ListNode node = head;
		for(int i = 1; i<n ; i++){
			node.next = new ListNode(i);
			node = node.next;
		}
		node = findKthLast(head,k);
		System.out.println(node.value);

	}

	private static ListNode findKthLast(ListNode head, int k) {
		int count = 0;
		ListNode node = head;
		ListNode kth = head;
		while(null!=node){
			node = node.next;
			count++;
			if(count>k){
				kth = kth.next;
			}
		}
		return kth;
	}

}
