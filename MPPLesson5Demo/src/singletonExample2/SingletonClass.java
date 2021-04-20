package singletonExample2;

public class SingletonClass {
	private static SingletonClass SingletonInstance=null;
	String key;
	
	private SingletonClass() {
		key="K135J89L35";
	}
	public static SingletonClass getSingletonObject() {
		if(SingletonInstance==null) {
			SingletonInstance =new SingletonClass();
			System.out.println("Key generated successfully.");
			SingletonInstance.getKey();
			return SingletonInstance;
		}
		System.out.println("Unsuccessful to produce the key...");
		return null;
	}
	private void getKey() {
		System.out.println("Your key to activate avast antivirus is: "+key);
	}

}
