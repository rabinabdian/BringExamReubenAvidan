package base;
import org.junit.*;
import org.openqa.selenium.*;

public class Setup {

    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void bc(){
        setDriver("chrome");
    }

    private static void setDriver(String webbrowser){
        driver = DriverFactory.getbrowser(webbrowser);
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public static void ac(){
//        driver.quit();
//    }
}
