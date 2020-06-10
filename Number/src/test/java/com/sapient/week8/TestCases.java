package com.sapient.week8;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
    private Number app;
    
    @Before
    public void setup() {
        app = new Number();
    }
    
    
    @Test
    public void test1() {
        boolean ans = app.checkPrime(29);
        assertTrue(ans == true);
    }

    @Test
    public void test2() {
        boolean ans = app.checkPrime(128);
        assertTrue(ans == false);
    }

    @Test
    public void test3() {
        boolean ans = app.checkPrime(19);
        assertTrue(ans == true);
    }

    @Test
    public void test4() {
        boolean ans = app.checkPalindrome(15415);
        assertTrue(ans == false);
    }

    @Test
    public void test5() {
        boolean ans = app.checkPalindrome(98577589);
        assertTrue(ans == true);
    }
    @Test
    public void test6() {
        boolean ans = app.checkPalindrome(952259);
        assertTrue(ans == true);
    }
    @Test
    public void test7() {
        boolean ans = app.checkArmstrong(371);
        assertTrue(ans == true);
    }
    @Test
    public void test8() {
        boolean ans = app.checkArmstrong(407);
        assertTrue(ans == true);
    }
    @Test
    public void test9() {
        boolean ans = app.checkArmstrong(489);
        assertTrue(ans == false);
    }
}
