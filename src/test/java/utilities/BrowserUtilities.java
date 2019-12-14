package utilities;

public class BrowserUtilities {

    //Compare two strings and if equal prints PASSEd else FAiled
    public static void verifyEquals(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("FAILED test");
        }
    }
    //Compare two strings and if equal prints PASSEd else FAiled
    public static void verifyEquals(int actual, int expected){
        if(actual==(expected)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("FAILED test");
        }
    }

    public static void wait(double seconds){

        try {
            Thread.sleep((long)(1000*seconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
        TestCase1:
          Step 1: Go to :https://practice-cybertekschool.herokuapp.com
          Step 2: Go to Sign Up link
          Step 3: Enter Full class
          Step 4: Enter Email (fake)
          Step 5: Click Sign Up
          Step 6: Verify that the following message is displayed :
          "Thank you for signing up. Click the button below to return to the home page."
     */



}
