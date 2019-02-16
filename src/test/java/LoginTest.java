import org.testng.annotations.Test;
import pages.LoginPage;
import utils.JiraProperties;

import static org.testng.Assert.assertEquals;


public class LoginTest {

    @Test(priority=0)
    public void testWithChrome() {

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();

        String expectedTitle = loginPage.getPageTitle();
        String actualTitle ;

        loginPage.inputValueIntoField(loginPage.getLoginFieldXPath(), JiraProperties.getUserLogin());
        loginPage.inputValueIntoField(loginPage.getPasswordFieldXPath(),JiraProperties.getUserPassword());
        loginPage.clickElement(loginPage.getSubmitButtonXPath());


        actualTitle = loginPage.getPageTitle();

        // выполняем проверку
        assertEquals(actualTitle, expectedTitle);
        loginPage.closeChromeDriver();
    }

}