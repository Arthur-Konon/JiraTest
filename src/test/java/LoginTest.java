import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;


public class LoginTest {

    @BeforeMethod
    public void beforeMethod() {
        utils.ChromeDriver.initWebDriver();
        utils.ChromeDriver.getChromeDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void main() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.inputLogin();
        loginPage.inputPassword();
        loginPage.submit();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.findElement(dashboardPage.getLogOutLinkPath());
    }

    @AfterMethod
    public void afterMethod() {
        utils.ChromeDriver.closeChromeDriver();
    }

}