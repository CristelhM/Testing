package main.java.marines.singleton;

/**
 * Singleton class that only can create 1 instance.
 * 
 * @author Marines Lopez Soliz
 */
public class SingletonClass {

	private static SingletonClass singleInstance = null;

	private SingletonClass() {
	}

	/**
	 * Method that get a singleton instance, if not exist create one.
	 * 
	 * @return SingletonClass
	 */
	public static SingletonClass getInstance() {
		if (singleInstance == null) {
			synchronized (SingletonClass.class) {
				singleInstance = new SingletonClass();
			}
		}
		return singleInstance;
	}
}
