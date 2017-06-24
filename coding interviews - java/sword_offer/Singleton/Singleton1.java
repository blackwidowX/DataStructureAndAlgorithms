package sword_offer.Singleton;
/**
 * ����ʽ
 * @author niuxiao
 * ʱ�任�ռ�
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	private Singleton1(){
		
	}
	
	//��ͨ����ʽ���̲߳���ȫ
	public static Singleton1 getSingleton1(){
		if(null==instance){
			instance = new Singleton1();
		}
		return instance;
	}
	
	//����ʽ���̰߳�ȫ��Ч�ʵ�
	public static synchronized Singleton1 getSingleton2(){
		if(null==instance){
			instance = new Singleton1();
		}
		return instance;
	}
	/*ͬ�ϣ�����ʵ�ֲ�ͬ
	 * public Singleton1 getSingleton2(){
		synchronized(Singleton1.class){
			if(null==instance){
				instance = new Singleton1();
			}
			return instance;
		}
	 */
	//����ʽ���̰߳�ȫ��Ч�ʽϸߣ�double-checking)
	//��˫�ؼ����������Ƶ�ʵ�ֻ�ʹ�ùؼ���volatile��������˼�ǣ���volatile���εı�����ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д����ֱ�Ӳ��������ڴ棬�Ӷ�ȷ������߳�����ȷ�Ĵ���ñ�����
	//private volatile static Singleton1 instance = null;
	public static Singleton1 getSingleton3(){
		if(null==instance){
			synchronized(Singleton1.class){
				if(null==instance){
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
