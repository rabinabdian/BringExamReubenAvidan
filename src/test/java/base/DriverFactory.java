package base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    public static WebDriver getbrowser(String webbrowser) {
        if ("chrome".equals(webbrowser))
            return initializeChrome();
        else if ("firefox".equals(webbrowser))
            return initializeFirefox();
        else
            return initializeFirefox();
    }

    private static WebDriver initializeChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver initializeFirefox(){
        return new FirefoxDriver();
    }
}
