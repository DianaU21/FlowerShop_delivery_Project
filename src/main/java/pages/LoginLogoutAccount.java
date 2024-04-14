package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginLogoutAccount {
    private WebDriver driver;
    public LoginLogoutAccount(WebDriver driver)
    {this.driver=driver;}

    public void clickLoginButton(){
        WebElement loginButton= driver.findElement(By.xpath("/html/body/header/nav/div/a[1]"));
        loginButton.click();
    }
    public void loginAccountInfo(String email,String password){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[1]/tbody/tr[1]/td[2]/input")));

        WebElement email_locator= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[1]/tbody/tr[1]/td[2]/input"));
        WebElement password_locator= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[1]/tbody/tr[2]/td[2]/input"));
        email_locator.sendKeys(email);
        password_locator.sendKeys(password);
    }
    public void selectKeepMeLoggedIn(){
        WebElement keepMeLoggedIn= driver.findElement(By.id("permanent"));
        keepMeLoggedIn.click();
    }
    public void clickLoginAccount(){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[2]/tbody/tr/td[1]/button")));
        WebElement loginAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[2]/tbody/tr/td[1]/button"));
        loginAccount.click();
    }
    public void clickLogoutButton(){
        WebElement logoutButton= driver.findElement(By.xpath("/html/body/header/nav/div/a[3]"));
        logoutButton.click();
    }
}
