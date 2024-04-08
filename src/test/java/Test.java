import pages.LoginAccount;
import pages.RegisterAccount;
import pages.RegisterExistingEmail;
import pages.SearchProduct;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void registerNewAccount() throws InterruptedException {
        RegisterAccount registerAccount = new RegisterAccount(driver);
        registerAccount.clickRegisterButton();
        registerAccount.registerAccountInfo("dianaungureanu12@gmail.com","floridelivrat1#","floridelivrat1#");
        Thread.sleep(2000);
        registerAccount.clickRegisterAccount();
        registerAccount.clickEnterTheAccount();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void loginNewAccount() throws InterruptedException {
        LoginAccount loginAccount= new LoginAccount(driver);
        loginAccount.clickLoginButton();
        loginAccount.loginAccountInfo("dianaungureanu2@gmail.com","floridelivrat1#");
        Thread.sleep(2000);
        loginAccount.selectKeepMeLoggedIn();
        loginAccount.clickLoginAccount();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void verifyRegisterErrorWithAnExistingEmail() throws InterruptedException{
        RegisterExistingEmail registerExistingEmail=new RegisterExistingEmail(driver);
        registerExistingEmail.clickRegisterButton();
        registerExistingEmail.registerAccountInfoSameEmail("dianaungureanu2@gmail.com","floridelivrat1#","floridelivrat1#");
        Thread.sleep(2000);
        registerExistingEmail.clickRegisterAccount();
        registerExistingEmail.verifyErrorMessageWithEmailAlredyRegistred();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test
    public void verifySearchSpecificProductAndViewDetails() throws InterruptedException{
        SearchProduct searchProduct= new SearchProduct(driver);
        searchProduct.specificSearchProduct("bambus");
        searchProduct.clickSearch();
        Thread.sleep(2000);
        searchProduct.clickViewProduct();
        Thread.sleep(5000);
    }
}
