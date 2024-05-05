package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class goibibocalender {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
       // driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.MILLISECONDS);
        driver.get("https://www.goibibo.com/");

    }
}
