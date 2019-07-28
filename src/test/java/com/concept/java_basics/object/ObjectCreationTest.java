package com.concept.java_basics.object;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith (JUnit4.class)
public class ObjectCreationTest {

	@Test
	public void testBankObjectCreation () {
		String bankName = "Bank";
		Bank bank = new Bank(bankName);
		assertEquals(bankName, bank.getName());
	}
	
}
