package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1_Annotations {
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }
    
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }
}
