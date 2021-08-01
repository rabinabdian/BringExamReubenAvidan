package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@UtilityClass
public class Actions {

    public String generateRnd() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String strDate = dateFormat.format(date);
        return strDate.replace(':','a');
    }
    public boolean tableReader(String stringToSearch,WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//table[@class=\"task_list table table-hover table-condensed\"]"));
        List<WebElement> rowCollection=element.findElements(By.xpath("//tr[@data-test-id=\"team_47528\"]"));
        System.out.println("Number of rows in this table: "+rowCollection.size());

        for(WebElement rowElement:rowCollection)
        {
            List<WebElement> colCollection=rowElement.findElements(By.xpath("td"));
            for(WebElement colElement:colCollection)
            {
                if (colElement.getText() == stringToSearch);
                return true;
            }
        }

        return false;
    }

    public void explicitWait(WebDriver driver , String xpathStr){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathStr)));
    }



}
