package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class practicetests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.kayak.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        //driver.findElement(By.className("vvTc-item-close")).click();
        /*driver.findElement(By.xpath("//div[@aria-label='Remove']")).click();
        WebElement city =driver.findElement(By.xpath("//input[@placeholder='From?']"));
        city.sendKeys("JF");
        Thread.sleep(200);
        List<WebElement> elementlist = driver.findElements(By.xpath("//*[@id=\"flight-origin-smarty-input-list\"]/li"));

        for(int i=1; i <= elementlist.size() && i <= 3;i++)
        {
            driver.findElement(By.xpath("//*[@id=\"flight-origin-smarty-input-list\"]/li["+i+"]/div/div[3]/span/span/input")).click();
            Thread.sleep(200);
        }
        driver.findElement(By.xpath("//input[@placeholder ='To?']")).sendKeys("atl");
        List<WebElement>tolist= driver.findElements(By.xpath("//*[@id=\"flight-destination-smarty-input-list\"]/li"));
        for(int i=1;i<= tolist.size()&& i<=3;i++)
        {
            System.out.println(tolist.get(i-1).getText());
            driver.findElement(By.xpath("//*[@id=\"flight-destination-smarty-input-list\"]/li["+i+"]/div/div[3]/span/span/input")).click();
            Thread.sleep(500);
        }
        */
        System.out.println(driver.findElement(By.xpath("//div[@aria-label='Start date']/div/span")).getText());

        //driver.quit();
    }
}
