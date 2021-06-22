package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MerchantConfiguration {

    // "Clean Account From Drivers, Customers and Tasks"
    @FindBy( how = How.XPATH ,using ="//input[@id=\"planning_phase_exists\"]")
    public WebElement chbGoTroughPlanningPhase;

    // update btn
    @FindBy( how = How.XPATH ,using ="/html/body/div[3]/div[2]/div/ng-view/div/div/div[2]/div/ng-include/div/div/div[1]/div/form/div/div[45]/div/input")
    public WebElement btnUpdate;



}
