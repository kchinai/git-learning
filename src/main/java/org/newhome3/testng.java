package org.newhome3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class testng {
    @Test(priority = 1)
    void setup(){
        System.out.println("this is setup");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("this is login");
    }
    @Test
    void teardown(){
        System.out.println("closing browser");
    }

            }