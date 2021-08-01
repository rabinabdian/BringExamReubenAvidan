package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    private WebDriver driver;
    final String URL = "https://app.bringg.com";

    public Base(WebDriver driver){
        this.driver = driver;
    }
    public void getUrl() {
        driver.get(URL);
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }
}
