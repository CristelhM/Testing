package test.java.marines.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.marines.singleton.SingletonClass;

/**
 * Test suit to verify Singleton public methods.
 * 
 * @author Marines Lopez Soliz
 */
class SingletonClassTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void singleton_getInstance_distinckNull() {
		SingletonClass singleton = SingletonClass.getInstance();
		assertNotNull(singleton);
	}

	@Test
	void singleton_getInstance_alwaysReturnSameInstance() {
		SingletonClass singleton1 = SingletonClass.getInstance();
		SingletonClass singleton2 = SingletonClass.getInstance();
		assertEquals(singleton1, singleton2);
	}

}
