package org.newhome2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseDoubleclick {
    public void calculatoremi(){

    }
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        //JavascriptExecutor js=(JavascriptExecutor).driver;
       // js.executeScript("window"."scrollbar");
//.rulermode-container        Actions action=new Actions(driver);
       WebElement loanslider= driver.findElement(By.cssSelector("label[for='loanamount']"));
        WebElement interestslider= driver.findElement(By.cssSelector("label[for='loaninterest']"));
        WebElement tenureslider= driver.findElement(By.cssSelector("label[for='loanterm']"));
  //      action.dragAndDropBy(loanslider,83,0).perform();
   //     action.dragAndDropBy(interestslider,41,0).build().perform();

     //   action.dragAndDropBy(tenureslider,-111,0).build().perform();
        WebElement loanemielement=driver.findElement(By.cssSelector(".rulermode-container"));
        String emitext=loanemielement.getText();
       // Assert.assertEquals(44986,emitext);

    }




