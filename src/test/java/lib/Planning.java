package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Planning {

    // btn_add_order
    @FindBy( how = How.XPATH ,using ="//*[@id=\"btn_add_order\"]")
    public WebElement addOrder;

    // txt_order_title
    @FindBy( how = How.XPATH ,using ="//*[@id=\"txt_order_title\"]")
    public WebElement orderTitle;

    // ui-select-teams
    @FindBy( how = How.XPATH ,using ="//*[@id=\"select_team\"]/ul/li/input")
    public WebElement selectTeams;

    // team options
    @FindBy( how = How.XPATH ,using ="//div[@class=\"employee-choice-wrapper ng-binding ng-scope\"]")
    public List<WebElement> teamOptions;

    //*[@id="wayPointCustomer-name"]/div[1]/span
    @FindBy( how = How.XPATH ,using ="//*[@id=\"wayPointCustomer-name\"]/div[1]/span/span[1]")
    public WebElement toWhom;

    //span[@class="ng-binding ng-scope"]
    @FindBy( how = How.XPATH ,using ="//span[contains(text(),\"DAVID\")]")
    public List<WebElement> toWhomOptions;


    //*[@id="waypoint_address"]/div[1]/span
    @FindBy( how = How.XPATH ,using ="//*[@id=\"waypoint_address\"]/div[1]/span")
    public WebElement whereTo;

    //span[contains(text(),"Jaffa, Tel Aviv-Yafo, Israel")]
    @FindBy( how = How.XPATH ,using ="//span[contains(text(),\"Jaffa, Tel Aviv-Yafo, Israel\")]")
    public WebElement whereToOption;

//*[@id="btn_add_new_order"]
@FindBy( how = How.XPATH ,using ="//*[@id=\"btn_add_new_order\"]")
public WebElement btnAddNewOrder;

//div[@class="ui-widget-content slick-row odd"]
@FindBy( how = How.XPATH ,using ="//div[@class=\"ui-widget-content slick-row odd\"]")
public List<WebElement> rowsOrderList;


}
