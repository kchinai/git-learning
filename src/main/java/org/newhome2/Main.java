package org.newhome2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

///html[1]/body[1]/div[2]/div[1]/main[1]/article[1]/h1[1]
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver.Options opt = driver.manage();
        //WebDriver.Window win = opt.window();
        //win.maximize();

        driver.get("https://www.edureka.co/signin");
        Actions builder = new Actions(driver);
        //Actions builder2 = builder.moveToElement(driver.findElement(By.id("ac")));
        //Action buildaction = builder2.build();
        //buildaction.perform();

        driver.get("https://www.walmart.com/");
       WebElement abc= (WebElement) (WebElement) driver.findElements(By.xpath("//a[@aria-label='Walmart+']//img[@loading='eager']" ));
        builder.moveToElement(abc).perform();
        builder.contextClick(abc);

        //WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(Duration.of(90));
    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.println("Hello and welcome!");

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    //   System.out.println("i = " + i);
        }

