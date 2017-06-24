package sword_offer.structure.tree;
/**
 * 题目：输入两棵二叉树A 和B，判断B 是不是A 的子结构。
 */
import sword_offer.structure.tree.BinaryTree.BinaryTreeNode;

public class ContainSubTree {
	public static void main(String[] args) {
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 }; 
        BinaryTreeNode tree = BinaryTree.rebuild1(pre,0,pre.length-1,in,0,in.length-1);
        int[] pre2 = {3,5,6,8};
        int[] in2 = {5,3,8,6};
        BinaryTreeNode sub = BinaryTree.rebuild1(pre2,0,pre2.length-1,in2,0,in2.length-1);
        boolean result = isSubtree(tree,sub);
        System.out.println(result);
	}

	private static boolean isSubtree(BinaryTreeNode root, BinaryTreeNode sub) {
		if(root==sub){
			return true;
		}
		if(null==root){
			return false;
		}
		if(null==sub){
			return true;
		}
		return contains(root,sub)? true : isSubtree(root.left,sub)||isSubtree(root.right,sub);
		
		
	}

	private static boolean contains(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root1==root2){
			return true;
		}
		if(null==root2){
			return true;
		}
		if(null==root1){
			return false;
		}
		if(root1.value==root2.value){
			return contains(root1.left,root2.left)&&contains(root1.right,root2.right);
		}
		return false;
	}	
}
