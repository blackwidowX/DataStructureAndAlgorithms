package sword_offer.string;
/**
 * ��Ŀ����ʵ��һ�����������ַ����е�ÿ���ո��滻��"%20"�����硰We are happy.�����������We%20are%20happy.����
 * @author niuxiao
 *
 */
public class StringReplace {

	public static void main(String[] args) {
		String str = "God is a coder.";
		String oldStr = " ";
		String newStr = "%20";
		System.out.println(replace(str,oldStr,newStr));

	}

	private static char[] replace(String str, String oldStr, String newStr) {
		char[] chars = str.toCharArray();
		int length = 0;
		for(int i = 0; i<chars.length;i++){
			if(chars[i]==' '){
				length+=3;
			}else{
				length++;
			}
		}
		//System.out.println(length);
		char[] newChars = new char[length];
		for(int i = 0,j = 0; i<chars.length&&j<newChars.length;i++){
			if(chars[i]==' '){
				newChars[j++]='%';
				newChars[j++]='2';
				newChars[j++]='0';
			}else{
				newChars[j++]=chars[i];
			}
		}
		return newChars;
	}

}
