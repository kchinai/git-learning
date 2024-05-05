package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wplcalender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://woodbridgelibrary.org/1026/Public-Library");
        driver.manage().window().maximize();

        String month=driver.findElement(By.className("cp-miniCalendar-title")).getText();
        System.out.println(month);
        while(!month.equals("JUNE 2024")) {
            driver.findElement(By.xpath("//div[@id='widgetCalendar71ebe272-130e-4a00-8de5-8b1934f768e5']//button[contains(@aria-label,'Next Month')]")).click();
            Thread.sleep(1000);
            month = driver.findElement(By.className("cp-miniCalendar-title")).getText();
            System.out.println(month);
        }

        driver.findElement(By.cssSelector("a[href='/calendar.aspx?view=list&year=2024&month=4&day=30&CID=45']")).click();
        //driver.findElement(By.xpath("//*[@id=\"widgetCalendar71ebe272-130e-4a00-8de5-8b1934f768e5\"]/div[2]/div/div[1]/table/tbody/tr[6]/td[2]/a")).click();
        // driver.findElement(By.xpath("//div[@id='widgetCalendar71ebe272-130e-4a00-8de5-8b1934f768e5']//div[contains(@class,'cp-miniCalendar-title')][normalize-space()='May 2024']")).getText();
//  "//*[@aria-label="End date calendar input"]/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"
        for (int i = 0; i <7; i++) {

        }
    }

}
