package singleton;

public class MySingleton {
	public static int countInstances = 0;
	private static MySingleton instance = new MySingleton();
	private MySingleton() {
		++countInstances;
	}
	public static MySingleton getInstance() {
		return instance;
	}
	
	
}