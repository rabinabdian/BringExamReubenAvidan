package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private final WebDriver driver;
    // email
    @FindBy( how = How.XPATH ,using ="//*[@id=\"inputEmail\"]")
    public WebElement txtEmail;

    // Password
    @FindBy( how = How.XPATH ,using ="//*[@id=\"inputPassword\"]")
    public WebElement txtPassword;

    // Login button
    @FindBy( how = How.XPATH ,using ="//*[@id=\"userPassword\"]")
    public WebElement btnLogin;


    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Login enterEmail(String email) {
        txtEmail.sendKeys(email);
        return this;
    }

    public Login enterPassword(String password) {
        txtPassword.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        btnLogin.click();
    }


}
