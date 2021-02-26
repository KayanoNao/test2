package ink.zlm.designpattern;

/**
 * 单例模式
 * @author Zhao Luming(赵路明)
 * @create 2021-01-29 上午 8:49
 */
public class Singleton {
	private static volatile Singleton instance = null;

	private Singleton() {
	}

	//运行时加载对象
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
