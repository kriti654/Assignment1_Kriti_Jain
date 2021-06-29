package com.sapient.trg.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AdditionTest {
	
	private Addition a1 = null;

	@BeforeEach
	void setUp() throws Exception {
		a1 = new Addition();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testForValidAddition() {
		assertEquals(10.0,a1.add(5.0,5.0));
	}
	
	@Test
	void testForInValidAddition() {
		assertNotEquals(10.0,a1.add(5.0,6.0));
	}

}
