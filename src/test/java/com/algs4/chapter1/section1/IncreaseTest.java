package com.algs4.chapter1.section1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.algs4.chapter1.section1.practice.Increase;

public class IncreaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Twenty_six() {
		// 1.1.26
//		Increase.abcSort(1, 2, 3);
//		Increase.abcSort(1, 3, 2);
//		Increase.abcSort(2, 1, 3);
//		Increase.abcSort(2, 3, 1);
		Increase.abcSort(3, 1, 2);
//		Increase.abcSort(3, 2, 1);
	}
	
	@Test
	public void test() {
		
	}

}
