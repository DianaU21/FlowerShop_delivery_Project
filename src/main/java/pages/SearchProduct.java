package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchProduct {
    private WebDriver driver;
    public SearchProduct(WebDriver driver)
        {this.driver=driver;}

    public void specificSearchProduct(String name){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[5]/div/div[2]/form/input")));
        WebElement name_locator= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/input"));
        name_locator.sendKeys(name);
    }
    public void clickSearch(){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[5]/div/div[2]/form/button")));
        WebElement searchForProduct= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/button"));
        searchForProduct.click();
    }
    public void clickViewProduct(){
        WebElement viewProduct= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/a[2]"));
        viewProduct.click();
    }
    public void clickSize(){
        WebElement size= driver.findElement(By.id("variant1"));
        size.click();
    }
    public void clickAddSpecialGift(){
        WebElement specialGift= driver.findElement(By.id("extra3135"));
        specialGift.click();
    }
    public void AddMessage(String name){
        WebElement message_locator= driver.findElement(By.className("productMessage"));
        message_locator.sendKeys(name);
    }
    public void clickAddToCart(){
        WebElement addToCart= driver.findElement(By.className("productSubmit"));
        addToCart.click();
    }
    public void specificSearchProduct2(String name){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[5]/div/div[2]/form/input")));
        WebElement name2_locator= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/input"));
        name2_locator.sendKeys(name);
    }
    public void clickSearch2(){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[5]/div/div[2]/form/button")));
        WebElement searchForProduct2= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/button"));
        searchForProduct2.click();
    }
    public void clickViewProduct2(){
        WebElement viewProduct2= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/a[2]"));
        viewProduct2.click();
    }
    public void clickAddToCart2(){
        Duration timeout= Duration.ofMinutes(1);
        long timeoutSeconds =timeout.getSeconds();
        WebDriverWait wait= new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("productSubmit")));
        WebElement addToCart2= driver.findElement(By.className("productSubmit"));
        addToCart2.click();
    }
    public int numberOfProductinCart() {
        List<WebElement> productinCart = driver.findElements(By.className("cartRow"));
        return productinCart.size();
    }
}
