package sword_offer.Singleton;
/**
 * ����ʽ
 * @author niuxiao
 * �̰߳�ȫ��ʹ�þ�̬��ʼ��������JVM����֤�̰߳�ȫ
 * �ռ任ʱ��
 */
//��ͨ����ʽ
public class Singleton2 {
	//��̬��ʼ��������JVM����֤�̰߳�ȫ
	private static Singleton2 instance  = new Singleton2();
	private Singleton2(){
		
	}
	
	public static Singleton2 getIInsatnce1(){
		return instance;
	}
	
}

class Singleton22 {
	/**
     *    �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ��
     *    û�а󶨹�ϵ������ֻ�б����õ�ʱ�Ż�װ�أ��Ӷ�ʵ�����ӳټ��ء�
     */
	private static class SingletonHolder{
		/**
         * ��̬��ʼ��������JVM����֤�̰߳�ȫ
         */
		public static Singleton22 instance = new Singleton22();
	}
	
	private Singleton22(){
		
	}
	public static Singleton22 getInstance(){
		return SingletonHolder.instance;
	}
	
}
