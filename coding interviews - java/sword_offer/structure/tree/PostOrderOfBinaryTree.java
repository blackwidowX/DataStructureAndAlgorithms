package sword_offer.structure.tree;
/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ������򷵻�true�����򷵻�false���������������������������ֶ�������ͬ
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
		int index = start;//indexΪ���������ֽ���±�
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
