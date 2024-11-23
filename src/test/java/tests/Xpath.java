package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath {
    WebDriver driver=new ChromeDriver();

    @Test
    public void methodXPath(){
       driver.get("https://telranedu.web.app/login");
        WebElement inputEmail= driver.findElement(By.xpath("//form/input[1]"));
        inputEmail.sendKeys("my_email44@mail.com");
        WebElement inputPSW= driver.findElement(By.xpath("//form/input[@name='password']"));
        inputPSW.sendKeys("Test789@");
        WebElement btnRegistr= driver.findElement(By.xpath("//form/button[last()]"));
        btnRegistr.click();

    }
}
