package day3;

import org.testng.annotations.*;

public class TestNGIntro {
    /*
            @Test  --> Run a method without main method
            @BeforeMethod --> Runs before EVERY @Test method
            @AfterMethod --> runs after EVERY @Test method
            @BeforeTest --> Runs once before the whole test
            @AfterTest --> Runs once after the whole test
     */

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }


    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }



    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }


}
