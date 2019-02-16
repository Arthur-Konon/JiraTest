package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ChromeDriver;
import utils.JiraProperties;

public abstract class Page {

    private static final String PAGE_URL = JiraProperties.getJiraURL();
    private String PageTitle = "System Dashboard - Hillel IT School JIRA";
    private WebDriver driver = ChromeDriver.initWebDriver();

    public String getPageTitle() {
        return PageTitle;
    }

    public void navigate(){
        driver.get(PAGE_URL);
    }

    public void closeChromeDriver(){
        driver.close();
    }
    public void inputValueIntoField (String xPath,String keys){
        driver.findElement(By.xpath(xPath)).sendKeys(keys);
    }

    public void clickElement (String xPath){
        driver.findElement(By.xpath(xPath)).click();
    }
}
