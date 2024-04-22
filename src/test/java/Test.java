import org.testng.Assert;
import pages.LoginLogoutAccount;
import pages.RegisterAccount;
import pages.RegisterExistingEmail;
import pages.SearchProduct;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void registerNewAccount() throws InterruptedException {
        RegisterAccount registerAccount = new RegisterAccount(driver);
        registerAccount.clickRegisterButton();
        registerAccount.registerAccountInfo("dianaungureanu84@gmail.com","floridelivrat1#","floridelivrat1#");
        registerAccount.clickRegisterAccount();
        System.out.println("Registration done successfully");
        registerAccount.clickEnterTheAccount();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test
    public void loginLogoutNewAccount() throws InterruptedException {
        LoginLogoutAccount loginLogoutAccount= new LoginLogoutAccount(driver);
        loginLogoutAccount.clickLoginButton();
        loginLogoutAccount.loginAccountInfo("dianaungureanu88@gmail.com","floridelivrat1#");
        loginLogoutAccount.selectKeepMeLoggedIn();
        loginLogoutAccount.clickLoginAccount();
        System.out.println("Login done successfully");
        Thread.sleep(2000);
        loginLogoutAccount.clickLogoutButton();
        System.out.println("Logout done successfully");
        Thread.sleep(2000);
    }

    @org.testng.annotations.Test
    public void verifyRegisterErrorWithAnExistingEmail() throws InterruptedException{
        RegisterExistingEmail registerExistingEmail=new RegisterExistingEmail(driver);
        registerExistingEmail.clickRegisterButton();
        registerExistingEmail.registerAccountInfoSameEmail("dianaungureanu88@gmail.com","floridelivrat1#","floridelivrat1#");
        registerExistingEmail.clickRegisterAccount();
        System.out.println("There is already an account registered with this email address");
        registerExistingEmail.verifyErrorMessageWithEmailAlredyRegistred();
        Thread.sleep(3000);
    }

    @org.testng.annotations.Test
    public void verifySearchSpecificProductAndViewDetails() throws InterruptedException{
        SearchProduct searchProduct= new SearchProduct(driver);
        searchProduct.specificSearchProduct("bambus");
        searchProduct.clickSearch();
        searchProduct.clickViewProduct();
        searchProduct.clickSize();
        searchProduct.clickAddSpecialGift();
        Thread.sleep(1000);
        searchProduct.AddMessage("Happy Birthday");
        Thread.sleep(1000);
        searchProduct.clickAddToCart();
        System.out.println("Product added successfully");
        searchProduct.specificSearchProduct2("trandafir");
        searchProduct.clickSearch2();
        searchProduct.clickViewProduct2();
        searchProduct.clickAddToCart2();
        System.out.println("Number of products in the cart:");
        System.out.println(searchProduct.numberOfProductinCart());
        Assert.assertEquals(searchProduct.numberOfProductinCart(),2);
        Thread.sleep(3000);
    }
}
