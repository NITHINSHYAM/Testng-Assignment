package com.Nithin.TestngAssignment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;
import com.maveric.core.utils.reporter.Report;

public class Calculator{
	
	static int number1 = 22;
	static int number2 = 11;
	
	@Test(groups="Test A")
	public static void add() {
	
		int add = number1 + number2;
		Assert.assertEquals(33, add);
		System.out.println(add);
	}
	
	@Test(groups="Test A")
	public static void subtract() {
	
		int sub = number1 - number2;
		Assert.assertEquals(11, sub);
		System.out.println(sub);
		
	}
	
	@Test(groups="Test B")
	public static void multiply() {
	
		int mul = number1 * number2;
		assertEquals(242, mul);
		System.out.println(mul);
		
	}
	
	@Test(groups="Test A")
	public static void divideInt() {
	
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
         	}
		int div = number1/number2;
		assertEquals(2, div);
		System.out.println(div);
		
	}
	
	@Test(groups="Test A")
	public static void divideReal() {
		
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
        	}
		int divR = number1/number2;
		assertEquals(2, divR);
		System.out.println(divR);

	}
	
	@Test(groups="Test A")
	public static void exponent() {
		
		double exp = Math.pow(number1, number2);
		assertTrue(true);
		System.out.println(exp);
		
	}
	
	@Test(groups="Test B")
	public static void inverse() {
	
		if (number1 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
			}	
		int exp = 1/number1;
		assertTrue(true);
		System.out.println(exp);
		
	}
	
	@Test(groups="Test C")
	public static void modulus() {
	
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
			}
		int mod = number1 % number2;
		assertEquals(0, mod);
		System.out.println(mod);
		
	}
	
	@Test(groups="Test C")
	public static void negate() {
		
		int neg = (-1) * number1;
		Assert.assertEquals(-22, neg);
		System.out.println(neg);
		
	}
	
	@BeforeTest
	public static void main(String[] args) {
		
		add();
		subtract();
		multiply();
		divideInt();
		divideReal();
		exponent();
		inverse();
		modulus();
		negate();
		
	}
}