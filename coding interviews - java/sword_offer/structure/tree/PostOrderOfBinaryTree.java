package sword_offer.structure.tree;
/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true。否则返回false。假设输入的数组的任意两个数字都互不相同
 * @author niuxiao
 */
public class PostOrderOfBinaryTree {

	public static void main(String[] args) {
		int[] arr = {4, 8, 6, 12, 16, 14, 10};
		boolean result = isPost(arr,0,arr.length-1);
		System.out.println(result);
	}

	private static boolean isPost(int[] post,int start,int end) {
		if(start>=end) return true;
		int root = post[end];
		int index = start;//index为左右子树分界点下标
		boolean isLeft = true;
		for (int i = start; i < end; i++) {
			if(isLeft&&post[i]>root){
					index = i;
					isLeft = false;
			}else if(!isLeft&&post[i]<root){
				return false;
			}
		}
		return isPost(post,start,index-1)&&isPost(post,index,end-1);
	}

}
