package sword_offer.array.MultiDimention;
/**
 * 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次扫印出每一个数字
 * @author niuxiao
 *
 */
public class ClockwisePrint {

	public static void main(String[] args) {
		int m = 5;
		int n = 4;
		int[][] arr = createMulArr(m,n);
		clockwisePrint(arr,0,m-1,0,n-1);
	}

	private static void clockwisePrint(int[][] arr, int rs, int re, int cs, int ce) {
		while(rs<=re&&cs<=ce){
			for (int j = cs; j <= ce; j++) {
				System.out.println(arr[rs][j]);
			}
			rs++;
			for (int i = rs; i <= re; i++) {
				System.out.println(arr[i][ce]);
			}
			ce--;
			if(rs>re){
				return;
			}
			for (int j = ce; j >= cs; j--) {
				System.out.println(arr[re][j]);
			}
			re--;
			if(ce<cs){
				return;
			}
			for (int i = re; i >= rs; i--) {
				System.out.println(arr[i][cs]);
			}
			cs++;
		}
		
	}

	private static int[][] createMulArr(int m, int n) {
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = i*10 + j;
			}
		}
		return arr;
	}

}
