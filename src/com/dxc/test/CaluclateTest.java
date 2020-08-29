package com.dxc.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dxc.beans.Caluclate;

public class CaluclateTest {
	//Calculator c=new Calculator();
	Caluclate c=null;
	@Before
	public void meth1()
	{
		c=new Caluclate();
	}
	@After
	public void meth2()
	{
		c=null;
	}
	
	@BeforeClass
	public static void meth3()
	{
		System.out.println("before starting");
	}
	
	@AfterClass
	public static void meth4()
	{
		System.out.println("after completing");
	}

	@Test
	public void testAdd() {
		assertEquals(6, c.add(4, 2));
		assertNotEquals(7, c.add(4, 2));
	}

	@Test
	public void testSubtractor() {
		assertEquals(2, c.sub(4, 2));
		assertNotEquals(7, c.sub(4, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals(8, c.mul(4, 2));
		assertNotEquals(9, c.mul(4, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(5, c.div(10, 2), 0.001);
		//assertEquals(5, c.div(10, 2));
		assertNotEquals(6, c.div(10, 2), 0.001);
	}

}
