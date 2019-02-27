package main.java.marines.singleton;

/**
 * Singleton class that only can create 1 instance.
 * 
 * @author Marines Lopez Soliz
 */
public class SingletonClass {

	private static SingletonClass SINGLE_INSTANCE = null;

	private SingletonClass() {
	}

	/**
	 * Method that get a singleton instance, if not exist create one.
	 * 
	 * @return SingletonClass
	 */
	public static SingletonClass getInstance() {
		if (SINGLE_INSTANCE == null) {
			synchronized (SingletonClass.class) {
				SINGLE_INSTANCE = new SingletonClass();
			}
		}
		return SINGLE_INSTANCE;
	}
}
