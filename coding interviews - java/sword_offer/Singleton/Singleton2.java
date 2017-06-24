package sword_offer.Singleton;
/**
 * 饿汉式
 * @author niuxiao
 * 线程安全，使用静态初始化器，由JVM来保证线程安全
 * 空间换时间
 */
//普通饿汉式
public class Singleton2 {
	//静态初始化器，由JVM来保证线程安全
	private static Singleton2 instance  = new Singleton2();
	private Singleton2(){
		
	}
	
	public static Singleton2 getIInsatnce1(){
		return instance;
	}
	
}

class Singleton22 {
	/**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
	private static class SingletonHolder{
		/**
         * 静态初始化器，由JVM来保证线程安全
         */
		public static Singleton22 instance = new Singleton22();
	}
	
	private Singleton22(){
		
	}
	public static Singleton22 getInstance(){
		return SingletonHolder.instance;
	}
	
}
