package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAccount {
    private WebDriver driver;
    public LoginAccount(WebDriver driver)
    {this.driver=driver;}

    public void clickLoginButton(){
        WebElement loginButton= driver.findElement(By.xpath("/html/body/header/nav/div/a[1]"));
        loginButton.click();
    }
    public void loginAccountInfo(String email,String password){
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
        WebElement loginAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/form/table[2]/tbody/tr/td[1]/button"));
        loginAccount.click();
    }
}
