package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTests {
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest(){
        driver.navigate().to("https://telranedu.web.app/home");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement btnLoginHeader = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLoginHeader.click();
        WebElement btnLoginReg = driver.findElement(By.cssSelector("button[name='registration']"));
        btnLoginReg.click();

        //driver.quit();
    }
    @Test
    public void secondTest(){
        driver.navigate().to("https://telranedu.web.app/home");
        WebElement elementText= driver.findElement(By.cssSelector("h2"));
        System.out.println(elementText.getText());
        WebElement btnAbout= driver.findElement(By.cssSelector("*[href='/about']"));
        System.out.println("tag name---- "+btnAbout.getTagName());
        System.out.println("text----" + btnAbout.getText());

        driver.quit();
    }
}
