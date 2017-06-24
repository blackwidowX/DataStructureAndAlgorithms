package sword_offer.structure.tree;

import java.sql.ResultSet;
import sword_offer.structure.tree.BinaryTree.BinaryTreeNode;

/**
 * 题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * @author niuxiao
 *
 */
public class MirrowOfTree {
ArrayList
	public static void main(String[] args) {
		ResultSet rs = new ResultSet();
		
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 }; 
        BinaryTreeNode tree = BinaryTree.rebuild1(pre,0,pre.length-1,in,0,in.length-1);
        BinaryTreeNode mirrow = getMirrow(tree);
        BinaryTree.printPre(mirrow);
	}

	private static BinaryTreeNode getMirrow(BinaryTreeNode tree) {
		if(null==tree){
			return null;
		}
		BinaryTreeNode root = new BinaryTreeNode(tree.value);
		root.left = getMirrow(tree.right);
		root.right = getMirrow(tree.left);
		return root;
	}
	
	

}
