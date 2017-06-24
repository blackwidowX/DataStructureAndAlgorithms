package sword_offer.array.MultiDimention;
//题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class TwoDimentionFind {

	public static void main(String[] args) {
		int[][] a = {{1,3,6,8},{4,5,9,11},{7,10,13,15}};
		int value = 0;
		boolean result = find(a,value);
		System.out.println(result);
	}
	
	public static boolean find(int[][] a, int value){
		boolean judge = false;
		int rNum = a.length;
		int cNum = a[0].length;
		/*
		 int r = 0,c = column;
		 while(r < row && c >= 0){
		 	if(a[r][c]==value){
		 		return true;
		 	}else if(a[r][c]>value){
		 		r--;
		 	}else{
		 		c++;
		 	}
		 }
		 return judge;
		 */
		for(int r = 0,c = cNum-1;r < rNum && c >= 0;){
			if(a[r][c]==value){
		 		judge = true;
		 		break;
		 	}else if(a[r][c]>value){
		 		c--;
		 	}else{
		 		r++;
		 	}
		}
		return judge;
	}

}
