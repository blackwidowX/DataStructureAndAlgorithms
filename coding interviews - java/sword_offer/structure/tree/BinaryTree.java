package sword_offer.structure.tree;
/**
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如：前序遍历序列｛ 1, 2, 4, 7, 3, 5, 6, 8｝和中序遍历序列｛4, 7, 2, 1, 5, 3, 8，6}，重建出下图所示的二叉树并输出它的头结点。
 */
import java.util.*;

public class BinaryTree {

	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left = null;
		BinaryTreeNode right = null;
		
		public BinaryTreeNode() {
		}
		public BinaryTreeNode(int value){
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		// 二叉树的前序遍历  
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };  
        // 二叉树的中序遍历  
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 }; 
        
        int[] post = { 7, 4, 2, 5, 8, 6, 3, 1 }; 
        
        BinaryTreeNode root = rebuild1(pre,0,pre.length-1,in,0,in.length-1);
        printPre(root);
        System.out.println();
        printIn(root);
        System.out.println();
        printPost(root);
        System.out.println();
        
        root = rebuild2(in,0,in.length-1,post,0,post.length-1);
        printPre(root);
        System.out.println();
        printLevel(root);

	}
	
	//重构：前序+中序
	public static BinaryTreeNode rebuild1(int[] pre,int ps,int pe,int[] in,int is,int ie){
		if (ps > pe) {  
            return null;  
        }  
		BinaryTreeNode root = new BinaryTreeNode(pre[ps]);
		//System.out.println(root.value);
		for(int i = is; i <= ie ; i++){
			if(in[i]==root.value){
				root.left = rebuild1(pre,ps+1,ps+i-is,in,is,i);
				root.right = rebuild1(pre,ps+i-is+1,pe,in,i+1,ie);
				break;
			}
		}
		return root;
	}
	
	//重构：中序+后序
	public static BinaryTreeNode rebuild2(int[] in,int is,int ie,int[] post,int pos,int poe){
		if (pos > poe) {  
            return null;  
        }  
		BinaryTreeNode root = new BinaryTreeNode(post[poe]);
		System.out.println(root.value);
		for(int i = is; i <= ie ; i++){
			if(in[i]==root.value){
				root.left = rebuild2(in,is,i,post,pos,pos+i-is-1);
				root.right = rebuild2(in,i+1,ie,post,pos+i-is,poe-1);
				break;
			}
		}
		return root;
	}
	
	//层序遍历 with Queue<T>,未分层
	public static void printLevel(BinaryTreeNode root){
		if(null==root){
			return;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode node = null;
		queue.offer(root);
		while(!queue.isEmpty()){
			if(null==(node = queue.poll())){
				continue;
			}
			System.out.print(node.value+" ");
			queue.offer(node.left);
			queue.offer(node.right);
		}
	}
	
	//前序遍历
	public static void printPre(BinaryTreeNode root){
		if(null==root){
			return;
		}
		System.out.print(root.value+" ");
		printPre(root.left);
		printPre(root.right);
	}
	
	//中序遍历
	public static void printIn(BinaryTreeNode root){
		if(null==root){
			return;
		}
		printIn(root.left);
		System.out.print(root.value+" ");
		printIn(root.right);
	}
	
	//后序遍历
	public static void printPost(BinaryTreeNode root){
		if(null==root){
			return;
		}
		printPost(root.left);
		printPost(root.right);
		System.out.print(root.value+" ");
	}

}
