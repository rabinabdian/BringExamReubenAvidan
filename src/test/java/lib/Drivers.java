package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Drivers {

    // Teams
    @FindBy( how = How.LINK_TEXT ,using ="Teams")
    public WebElement btnTeams;

    // Add Team
    @FindBy( how = How.XPATH ,using ="/html/body/div[3]/div[2]/div/ng-view/div/div[1]/div[2]/div/button")
    public WebElement btnAddTeam;

    // Login button
    @FindBy( how = How.XPATH ,using ="//*[@id=\"userPassword\"]")
    public WebElement btnLogin;

    // btn_add_driver
    @FindBy( how = How.XPATH ,using ="//*[@id=\"btn_add_driver\"]")
    public WebElement addDriver;

    // add driver name
    @FindBy( how = How.XPATH ,using ="//*[@id=\"userName\"]")
    public WebElement addDriverName;

    // dropdown User Validation
    @FindBy( how = How.XPATH ,using ="//*[@id=\"dropdownUserValidation\"]")
    public WebElement dropdownUserValidation;
// options
    @FindBy( how = How.TAG_NAME ,using ="li")
    public List<WebElement> dropdownOptions;

    // addDriverEmail
    @FindBy( how = How.XPATH ,using ="//*[@id=\"userEmail\"]")
    public WebElement addDriverEmail;

    // addDriverPass
    @FindBy( how = How.XPATH ,using ="//*[@id=\"userPassword\"]")
    public WebElement addDriverPass;

    // addDriverPass
    @FindBy( how = How.CSS ,using ="body > div.modal.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > a")
    public WebElement addDriverBtn;


    //teams table
    @FindBy( how = How.XPATH ,using ="//table[@class=\"task_list table table-hover table-condensed\"]")
    public WebElement teamsTable;

    //a[@data-test-id="teamName"]
    @FindBy( how = How.XPATH ,using ="//a[@data-test-id=\"teamName\"]")
    public List<WebElement> teamNameCol;

//ok button on success modal
@FindBy( how = How.XPATH ,using ="//button[@class=\"btn btn-primary\"]")
public WebElement okBtnSuccessModal;

// total numbers of drivers
    //p[@data-test-id="totalDrivers"]
@FindBy( how = How.XPATH ,using ="//p[@data-test-id=\"totalDrivers\"]")
public WebElement totalNumbersofDrivers;

}
