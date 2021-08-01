package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddTeamWindow {

    // teamName
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamName\"]")
    public WebElement teamName;

    // teamDescription
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamDescription\"]")
    public WebElement teamDescription;

    //*[@id=\"teamAddress\"]
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamAddress\"]")
    public WebElement teamAddressOpt;

    //*[@id="teamAddress"]/div[1]
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamAddress\"]/div[1]")
    public WebElement teamAddress;


    // options
    @FindBy( how = How.XPATH ,using ="//span[contains(text(),'Jaffa, Tel Aviv-Yafo, Israel')]")
    public WebElement tlvOption;

    // teamLat
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamLat\"]")
    public WebElement teamLat;

    // teamLng
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamLng\"]")
    public WebElement teamLng;

    // teamContactPhone
    @FindBy( how = How.XPATH ,using ="//*[@id=\"teamContactPhone\"]")
    public WebElement teamContactPhone;







    // add team btn
    @FindBy( how = How.XPATH ,using ="/html/body/div[1]/div/div/div/div[3]/a")
    public WebElement btnAddTeam;
}
