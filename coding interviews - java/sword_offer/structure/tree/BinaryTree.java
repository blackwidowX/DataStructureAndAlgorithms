package sword_offer.structure.tree;
/**
 * ��Ŀ������ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡����磺ǰ��������У� 1, 2, 4, 7, 3, 5, 6, 8��������������У�4, 7, 2, 1, 5, 3, 8��6}���ؽ�����ͼ��ʾ�Ķ��������������ͷ��㡣
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
		// ��������ǰ�����  
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };  
        // ���������������  
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
	
	//�ع���ǰ��+����
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
	
	//�ع�������+����
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
	
	//������� with Queue<T>,δ�ֲ�
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
	
	//ǰ�����
	public static void printPre(BinaryTreeNode root){
		if(null==root){
			return;
		}
		System.out.print(root.value+" ");
		printPre(root.left);
		printPre(root.right);
	}
	
	//�������
	public static void printIn(BinaryTreeNode root){
		if(null==root){
			return;
		}
		printIn(root.left);
		System.out.print(root.value+" ");
		printIn(root.right);
	}
	
	//�������
	public static void printPost(BinaryTreeNode root){
		if(null==root){
			return;
		}
		printPost(root.left);
		printPost(root.right);
		System.out.print(root.value+" ");
	}

}
