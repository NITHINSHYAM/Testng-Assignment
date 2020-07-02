package com.Nithin.TestngAssignment;

import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;

public class TestNG_AssertionReports extends BaseTest{
  static int number1=55;
  static int number2=5;
  @Test
  public void method1() {

	 int expectedresults=60;
	 int actual=number1+number2;
	 Assert.assertEquals(expectedresults, actual);
	 Reporter.log("Test Passed", true);
  }
  @Test
  public void method2() {
	 int expectedresults=50;
	 int actual=number1-number2;
	 Assert.assertTrue(false);
	 Reporter.log("Failed Testcase", true); 
  }
  @Test
  public void method3() {

		 int expectedresults=60;
		 int actual=number1+number2;
		 Assert.assertNotEquals(expectedresults, actual);
		 Reporter.log("Test Passed", true);
	  }
  @Test
  public void method4() {

		 int expectedresults=60;
		 int actual=number1+number2;
		 Assert.assertFalse(false);
		 Reporter.log("Test Passed", true);
	  }
}
