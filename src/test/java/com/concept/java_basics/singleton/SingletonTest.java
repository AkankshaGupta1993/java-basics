package com.concept.java_basics.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith (JUnit4.class)
public class SingletonTest {


	@Test
	public void testSingleton () {
	Singleton singleton = Singleton.getInstance();
	}
}
