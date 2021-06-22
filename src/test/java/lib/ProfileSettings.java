package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileSettings {

    // "Clean Account From Drivers, Customers and Tasks"
    @FindBy( how = How.XPATH ,using ="/html/body/div[3]/div[2]/div/ng-view/div/div/div[2]/div/div/ng-form/div[17]/div/input")
    public WebElement btnClean;

    // merchant_configuration option
    @FindBy( how = How.XPATH ,using ="//*[@id=\"left_menu_merchant_configuration\"]/a")
    public WebElement merchantConfiguration;

    // user icon
    @FindBy( how = How.XPATH ,using ="//*[@id=\"navbar\"]/div[1]/div[2]/signed-in/div/span/span/img")
    public WebElement iconUser;


}
