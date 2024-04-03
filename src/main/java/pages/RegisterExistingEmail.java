package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterExistingEmail {
    private WebDriver driver;

    public RegisterExistingEmail(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterButton() {
        WebElement registerButton = driver.findElement(By.xpath("/html/body/header/nav/div/a[2]"));
        registerButton.click();
    }
    public void registerAccountInfoSameEmail (String email, String password, String confirmPassword){
        WebElement email_locator = driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[1]/td[2]/input"));
        WebElement password_locator = driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[2]/td[2]/input"));
        WebElement confirmPassword_locator = driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[3]/td[2]/input"));
        email_locator.sendKeys(email);
        password_locator.sendKeys(password);
        confirmPassword_locator.sendKeys(confirmPassword);
    }
    public void clickRegisterAccount(){
        WebElement registerAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/button"));
        registerAccount.click();
    }
    public void verifyErrorMessageWithEmailAlredyRegistred(){
        WebElement errorMessage= driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/form/table/tbody/tr[2]/td[2]"));
        String errorText=errorMessage.getText();
        assert errorText.equals("Există deja un cont înregistrat pe această adresă de email.");
    }
}