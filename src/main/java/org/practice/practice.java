package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://woodbridgelibrary.org/1218/How-Do-I");
        WebElement libcatalog=driver.findElement(By.id("mainNavLibraryCatalog"));
        Actions action=new Actions(driver);
        action.moveToElement(libcatalog).perform();
       // Thread.sleep(250);
        //driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(250);
        driver.findElement(By.linkText("Get a Library Card")).click();
       // driver.findElement(By.id("searchButton"))
               // .click();
        //driver.findElement(By.cssSelector(".wpl-home"))
               // .click();
        Thread.sleep(1000);
        driver.findElement(By.id("patron_firstName_input"))
                .sendKeys("krupa");
        driver.findElement(By.id("patron_middleName_input"))
                .sendKeys("jayant");
        driver.findElement(By.id("patron_lastName_input"))
                .sendKeys("maniar");
        driver.findElement(By.id("patronAddress1_LINE1_input"))
                .sendKeys("185 midfield rd colonia nj");
        driver.findElement(By.id("patronAddress1_LINE2_input"))
                .sendKeys("apt2");
        WebElement city =driver.findElement(By.id("patronAddress_cityST_select"));
        Select select=new Select(city);
        select.selectByVisibleText("COLONIA NJ");
        Thread.sleep(3);
        select.selectByValue("cl");
        Thread.sleep(3);
        select.selectByIndex(0);
        driver.findElement(By.id("patronAddress1_POSTALCODE_input"))
                .sendKeys("07067");
        WebElement verify = driver.findElement(By.cssSelector("button[type='button"));
        verify.click();
    }
}
