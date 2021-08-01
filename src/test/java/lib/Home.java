package lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class Home {

    // settings option
    @FindBy( how = How.XPATH ,using ="//*[@id=\"navbar\"]/div[1]/div[2]/signed-in/div/span/ul/li[3]/a")
    public WebElement optionSettings;

    // user icon
    @FindBy( how = How.XPATH ,using ="//*[@id=\"navbar\"]/div[1]/div[2]/signed-in/div/span/span/img")
    public WebElement iconUser;

    // menu_drivers
    @FindBy( how = How.XPATH ,using ="//*[@id=\"top_menu_drivers\"]/a")
    public WebElement tabDrivers;

    // menu planning tab
    @FindBy( how = How.XPATH ,using ="//*[@id=\"top_menu_planning\"]")
    public WebElement tabPlanning;


}
