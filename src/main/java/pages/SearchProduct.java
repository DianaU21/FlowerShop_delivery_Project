package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProduct {
    private WebDriver driver;
    public SearchProduct(WebDriver driver)
        {this.driver=driver;}

    public void specificSearchProduct(String name){
        WebElement name_locator= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/input"));
        name_locator.sendKeys(name);
    }
    public void clickSearch(){
        WebElement searchForProduct= driver.findElement(By.xpath("/html/body/header/div[5]/div/div[2]/form/button"));
        searchForProduct.click();
    }
    public void clickViewProduct(){
        WebElement viewProduct= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/a[2]"));
        viewProduct.click();
    }
}
