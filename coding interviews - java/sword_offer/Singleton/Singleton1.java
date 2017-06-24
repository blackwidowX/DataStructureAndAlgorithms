package sword_offer.Singleton;
/**
 * 懒汉式
 * @author niuxiao
 * 时间换空间
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	private Singleton1(){
		
	}
	
	//普通懒汉式，线程不安全
	public static Singleton1 getSingleton1(){
		if(null==instance){
			instance = new Singleton1();
		}
		return instance;
	}
	
	//懒汉式，线程安全，效率低
	public static synchronized Singleton1 getSingleton2(){
		if(null==instance){
			instance = new Singleton1();
		}
		return instance;
	}
	/*同上，代码实现不同
	 * public Singleton1 getSingleton2(){
		synchronized(Singleton1.class){
			if(null==instance){
				instance = new Singleton1();
			}
			return instance;
		}
	 */
	//懒汉式，线程安全，效率较高（double-checking)
	//“双重检查加锁”机制的实现会使用关键字volatile，它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
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
