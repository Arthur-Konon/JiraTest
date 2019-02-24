package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ChromeDriver;
import utils.JiraProperties;

public abstract class Page {

    protected final String PAGE_URL = JiraProperties.getJiraURL();
    private WebDriver driver = ChromeDriver.getChromeDriver();

    public String getActualPageTitle() {
        return driver.getTitle();
    }

    public void navigate(){
        driver.get(this.PAGE_URL);
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

    public void findElement(String xpath) {
        driver.findElement(By.xpath(xpath));
    }
}


