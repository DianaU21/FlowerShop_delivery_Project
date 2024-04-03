import pages.LoginAccount;
import pages.RegisterAccount;
import pages.RegisterExistingEmail;
import pages.SearchProduct;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void registerNewAccount() throws InterruptedException {
        RegisterAccount registerAccount = new RegisterAccount(driver);
        Thread.sleep(2000);
        registerAccount.clickRegisterButton();
        Thread.sleep(2000);
        registerAccount.registerAccountInfo("dianaungureanu6@gmail.com","floridelivrat1#","floridelivrat1#");
        Thread.sleep(2000);
        registerAccount.clickRegisterAccount();
        Thread.sleep(2000);
        registerAccount.clickEnterTheAccount();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void loginNewAccount() throws InterruptedException {
        LoginAccount loginAccount= new LoginAccount(driver);
        Thread.sleep(2000);
        loginAccount.clickLoginButton();
        Thread.sleep(2000);
        loginAccount.loginAccountInfo("dianaungureanu2@gmail.com","floridelivrat1#");
        Thread.sleep(2000);
        loginAccount.selectKeepMeLoggedIn();
        Thread.sleep(2000);
        loginAccount.clickLoginAccount();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void verifyRegisterErrorWithAnExistingEmail() throws InterruptedException{
        RegisterExistingEmail registerExistingEmail=new RegisterExistingEmail(driver);
        Thread.sleep(2000);
        registerExistingEmail.clickRegisterButton();
        Thread.sleep(2000);
        registerExistingEmail.registerAccountInfoSameEmail("dianaungureanu2@gmail.com","floridelivrat1#","floridelivrat1#");
        Thread.sleep(2000);
        registerExistingEmail.clickRegisterAccount();
        Thread.sleep(2000);
        registerExistingEmail.verifyErrorMessageWithEmailAlredyRegistred();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void verifySearchSpecificProductAndViewDetails() throws InterruptedException{
        SearchProduct searchProduct= new SearchProduct(driver);
        Thread.sleep(2000);
        searchProduct.specificSearchProduct("bambus");
        Thread.sleep(2000);
        searchProduct.clickSearch();
        Thread.sleep(2000);
        searchProduct.clickViewProduct();
        Thread.sleep(5000);
    }
}
