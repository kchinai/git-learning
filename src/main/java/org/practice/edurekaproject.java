package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class edurekaproject {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.edureka.co/");
        driver.findElement(By.cssSelector(".signup_click.signup-vd.giTrackElementHeader")).click();
        driver.findElement(By.id("sg_popup_email")).sendKeys("maniar_k@yahoo.co.in");
        driver.findElement(By.cssSelector(".control_place.mob_vid_vw_nm.mobile_country_code.popusrphn")).sendKeys("9735190693");
        driver.findElement(By.cssSelector(".clik_btn_log.btn-block.signup-new-submit")).click();
    }
}
