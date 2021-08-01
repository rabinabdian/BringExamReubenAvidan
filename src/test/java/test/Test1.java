package test;

import base.Base;
import base.Setup;
import com.paulhammant.ngwebdriver.NgWebDriver;
import lib.*;
import org.junit.BeforeClass;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test1 extends Setup{

    private static WebDriver driver;
    NgWebDriver ngWebDriver;
    JavascriptExecutor jsDriver;
    static Base base;

    Login LoginPage;
    Home HomePage;
    ProfileSettings profileSettings;
    MerchantConfiguration merchantConfiguration;
    AddTeamWindow addTeamWindow;
    Drivers drivers;
    Planning planning;

    @BeforeClass
    public static void setUp() {
        driver=getDriver();
        base = new Base(driver);
        base.getUrl();

    }

    // example for functional programming Login class
    private void LoginAction() throws InterruptedException {
        LoginPage = PageFactory.initElements(driver,Login.class);
        LoginPage.enterEmail("candidate@bringg.com")
                .enterPassword("Candidate123!")
                .clickLogin();
        Thread.sleep(5000);
    }

    @Test
    public void test_01_CleanupAccountEnablePlanning() throws InterruptedException {

        LoginAction();
        HomePage = PageFactory.initElements(driver,Home.class);
        HomePage.iconUser.click();
        HomePage.optionSettings.click();
        profileSettings = PageFactory.initElements(driver,ProfileSettings.class);
        profileSettings.btnClean.click();
        Alert popup = driver.switchTo().alert();
        popup.accept();
        profileSettings.merchantConfiguration.click();
        Thread.sleep(5000);
        // Scroll down to reach the checkbox
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        merchantConfiguration = PageFactory.initElements(driver,MerchantConfiguration.class);
        if(!merchantConfiguration.chbGoTroughPlanningPhase.isSelected()) {
            merchantConfiguration.chbGoTroughPlanningPhase.click();
            merchantConfiguration.btnUpdate.click();
        }
        driver.navigate().refresh();

        Assert.assertTrue(merchantConfiguration.chbGoTroughPlanningPhase.isSelected());
    }

    @Test
    public void test_02_CreateNewTeam() throws InterruptedException {
        LoginAction();
        HomePage = PageFactory.initElements(driver,Home.class);
        HomePage.tabDrivers.click();

        Thread.sleep(3000);
        drivers= PageFactory.initElements(driver,Drivers.class);
        drivers.btnTeams.click();
        drivers.btnAddTeam.click();

        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);
        String prefix = lib.Actions.generateRnd();
        addTeamWindow = PageFactory.initElements(driver,AddTeamWindow.class);
        String teamName = "sprinters"+prefix;
        addTeamWindow.teamName.sendKeys(teamName);
        Thread.sleep(3000);
        addTeamWindow.teamAddress.click();
        Thread.sleep(8000);
        WebElement Item =addTeamWindow.teamAddressOpt;
        Actions action = new Actions(driver);
        action.doubleClick(Item).sendKeys("Jaffa, Tel Aviv-Yafo, Israel");
        action.click();
        action.perform();
        Thread.sleep(3000);
        addTeamWindow.tlvOption.click();
        addTeamWindow.btnAddTeam.click();
        driver.navigate().refresh();
// explicit wait - to wait for list
        String xpathTeamsTable = "//table[@class=\"task_list table table-hover table-condensed\"]";
        lib.Actions.explicitWait(driver,xpathTeamsTable);
        Assert.assertTrue(lib.Actions.tableReader(teamName,driver));
    }


    @Test
    public void test_03_CreateDrivers() throws InterruptedException {
        LoginAction();


        HomePage = PageFactory.initElements(driver,Home.class);
        HomePage.tabDrivers.click();

        Thread.sleep(3000);
        drivers= PageFactory.initElements(driver,Drivers.class);

        for (int i = 0; i < 2; i++) {
            drivers.addDriver.click();
            String addDriverWindow = driver.getWindowHandle();
            driver.switchTo().window(addDriverWindow);
            String prefix = lib.Actions.generateRnd();
            drivers.addDriverName.sendKeys("DAVID"+prefix);
            drivers.dropdownUserValidation.click();

            Thread.sleep(3000);
            // ⦁	Change the validation method from phone to email/password.

            drivers.dropdownOptions.get(1).click();
            drivers.addDriverEmail.sendKeys("DAVID"+prefix+"@IBM.com");
            drivers.addDriverPass.sendKeys("123456");
            Thread.sleep(1000);
            drivers.addDriverBtn.click();
            Thread.sleep(3000);
            String driverAddSuccessfullyModal = driver.getWindowHandle();
            driver.switchTo().window(driverAddSuccessfullyModal);
            String actualModalMessage = driver.findElement(By.xpath("//h2[@class=\"ng-binding\"]")).getText();
            String expectedModalMessage = "DAVID"+prefix +" was added successfully";
            drivers.okBtnSuccessModal.click();
            Assert.assertEquals(expectedModalMessage , actualModalMessage);

        }
        Thread.sleep(3000);
        Assert.assertEquals(2, drivers.totalNumbersofDrivers.getText().replaceAll("[^0-9]",""));

    }




    @Test
    public void test_04_CreateAnOrder() throws InterruptedException {
        LoginAction();

        HomePage = PageFactory.initElements(driver,Home.class);
        HomePage.tabPlanning.click();

        Thread.sleep(3000);
        planning = PageFactory.initElements(driver,Planning.class);
        String prefix = lib.Actions.generateRnd();
        planning.addOrder.click();
        String driverAddSuccessfullyModal = driver.getWindowHandle();
        driver.switchTo().window(driverAddSuccessfullyModal);
        planning.orderTitle.sendKeys("Order Title "+prefix);
        Thread.sleep(3000);
        planning.selectTeams.click();
        planning.teamOptions.get(0).click();

        WebElement Item = planning.toWhom;
        Actions action = new Actions(driver);
        action.doubleClick(Item).sendKeys("DAVID");
        action.click();
        action.perform();
        Thread.sleep(3000);
        planning.toWhomOptions.get(0).click();

        WebElement ItemWhereTo = planning.whereTo;
        Actions actionWhereTo = new Actions(driver);
        action.doubleClick(ItemWhereTo).sendKeys("Jaffa, Tel Aviv-Yafo, Israel");
        action.click();
        action.perform();
        Thread.sleep(3000);
        planning.whereToOption.click();
        // explicit wait - to wait for button to be click-able
        String xpathBtnAddNewOrder = "//*[@id=\"btn_add_new_order\"]";
        lib.Actions.explicitWait(driver,xpathBtnAddNewOrder);
        planning.btnAddNewOrder.click();
        int listOrderSize=1;
        Assert.assertEquals(planning.rowsOrderList.size(),listOrderSize);

    }



}
