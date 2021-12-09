package com.test.pnt.PNT_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is test anotation");
  }
  
  @Test(enabled=false)
  public void f1() {
	  System.out.println("This is test2 anotation");
  }
  
  @Test(invocationCount=2)
  public void f2() {
	  System.out.println("This is test3 anotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforemethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is aftermethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class anotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class anotation");
  }

}


