package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterAccount {
    private WebDriver driver;
    public RegisterAccount(WebDriver driver)
    {this.driver=driver;}

    public void clickRegisterButton(){
        WebElement registerButton= driver.findElement(By.xpath("/html/body/header/nav/div/a[2]"));
        registerButton.click();
    }
    public void registerAccountInfo(String email,String password,String confirmPassword){

        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[1]/td[2]/input")));

        WebElement email_locator= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[1]/td[2]/input"));
        WebElement password_locator= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[2]/td[2]/input"));
        WebElement confirmPassword_locator= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[3]/td[2]/input"));
        email_locator.sendKeys(email);
        password_locator.sendKeys(password);
        confirmPassword_locator.sendKeys(confirmPassword);
    }
    public void clickRegisterAccount(){
        WebElement registerAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/button"));
        registerAccount.click();
    }
    public void clickEnterTheAccount(){
        WebElement enterTheAccount= driver.findElement(By.xpath("/html/body/div[1]/div/p/a/strong"));
        enterTheAccount.click();
    }
}
